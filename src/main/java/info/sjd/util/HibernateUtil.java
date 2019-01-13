package info.sjd.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import info.sjd.entity.Cart;
import info.sjd.entity.Good;
import info.sjd.entity.Order;
import info.sjd.entity.User;

public class HibernateUtil {

    private static SessionFactory sessionFactory = createSessionFactory();

    private static SessionFactory createSessionFactory() {
//        Configuration configuration = new Configuration().configure();
        Configuration configuration = new Configuration();
        
        configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Good.class);
		configuration.addAnnotatedClass(Order.class);
		configuration.addAnnotatedClass(Cart.class);
       
		return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
