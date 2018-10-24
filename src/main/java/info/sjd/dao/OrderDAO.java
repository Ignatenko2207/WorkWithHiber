package info.sjd.dao;

import info.sjd.entity.Order;
import info.sjd.util.HibernateUtil;
import org.hibernate.Session;

public class OrderDAO {
    public static void saveOrUpdate(Order order) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.saveOrUpdate(order);

        session.getTransaction().commit();

        session.close();
    }

    public static Order  get(Integer orderId) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        Order order = session.get(Order.class, orderId);

        session.getTransaction().commit();

        session.close();

        return order;
    }

    public static void delete(Order order) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.delete(order);

        session.getTransaction().commit();

        session.close();
    }
}
