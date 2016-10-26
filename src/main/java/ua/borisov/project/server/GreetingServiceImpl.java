package ua.borisov.project.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.borisov.project.client.GreetingService;
import ua.borisov.project.server.service.greeting.GreetingsChoice;
import ua.borisov.project.server.service.LoginService;
import ua.borisov.project.server.service.md5.MD5;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalTime;
import java.util.Locale;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  public String greetServer(String login, String password) throws IllegalArgumentException, UnsupportedEncodingException, NoSuchAlgorithmException {

      String seed = "+seed";
      String md5Password =   MD5.md5Mehod(password+seed);
      boolean check = new LoginService().checkCred(login,md5Password);

    if (!check) {
      throw new IllegalArgumentException( );

    }

      GreetingsChoice greetingsChoice = new GreetingsChoice();
      return greetingsChoice.choice(Locale.getDefault(), LocalTime.now(), "cp1251") + login;
  }

}
