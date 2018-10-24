package info.sjd.dao;

import info.sjd.entity.Good;
import info.sjd.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GoodDAO{

    public static void saveOrUpdate(Good good) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.saveOrUpdate(good);

        session.getTransaction().commit();

        session.close();
    }

    public static Good  get(String articleId) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        Good good = session.get(Good.class, articleId);

        session.getTransaction().commit();

        session.close();

        return good;
    }

    public static void delete(Good good) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.delete(good);

        session.getTransaction().commit();

        session.close();
    }
}
