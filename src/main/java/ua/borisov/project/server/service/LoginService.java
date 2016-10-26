package ua.borisov.project.server.service;

import ua.borisov.project.server.service.DAL.UserManager;

/**
 * Created by User on 23.10.2016.
 */
public class LoginService {

    public boolean checkCred(String login, String password){
        return new UserManager().getUser(login,password);
    }

}
