package ua.borisov.project.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
  String greetServer(String name, String value) throws IllegalArgumentException, UnsupportedEncodingException, NoSuchAlgorithmException;
}
