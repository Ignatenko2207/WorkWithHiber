package info.sjd.dao;

import info.sjd.entity.User;
import info.sjd.util.HibernateUtil;
import org.hibernate.Session;

public class UserDAO {

    public static void saveOrUpdate(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.saveOrUpdate(user);

        session.getTransaction().commit();

        session.close();
    }

    public static User  get(String login) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        User user = session.get(User.class, login);

        session.getTransaction().commit();

        session.close();

        return user;
    }

    public static void delete(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.delete(user);

        session.getTransaction().commit();

        session.close();
    }
}
