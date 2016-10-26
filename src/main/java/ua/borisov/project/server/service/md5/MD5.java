package ua.borisov.project.server.service.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by User on 26.10.2016.
 */
public class MD5 {
    public static String md5Mehod(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(password.getBytes("UTF8"));
        byte s[] = m.digest();
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
        }

        return result;
    }
}
