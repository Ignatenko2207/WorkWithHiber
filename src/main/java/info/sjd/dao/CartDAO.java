package info.sjd.dao;

import info.sjd.entity.Cart;
import info.sjd.util.HibernateUtil;
import org.hibernate.Session;

public class CartDAO {

    public static void saveOrUpdate(Cart cart) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.saveOrUpdate(cart);

        session.getTransaction().commit();

        session.close();
    }

    public static Cart get(Integer cartId) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        Cart cart = session.get(Cart.class, cartId);

        session.getTransaction().commit();

        session.close();

        return cart;
    }

    public static void delete(Cart cart) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.delete(cart);

        session.getTransaction().commit();

        session.close();
    }
}
