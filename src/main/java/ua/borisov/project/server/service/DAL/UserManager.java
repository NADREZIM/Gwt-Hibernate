package ua.borisov.project.server.service.DAL;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 23.10.2016.
 */
public class UserManager {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public Boolean getUser(String login, String password) {
        Session session = factory.openSession();
        boolean result;
        List users = new ArrayList();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("from User where login = :paramLogin and password = :paramPassword");
            query.setParameter("paramLogin", login);
            query.setParameter("paramPassword", password);
            users = query.list();
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        if (users.size()==0){
            result = false;
        }
        else {
            result = true;
        }
    return result;
    }

}
