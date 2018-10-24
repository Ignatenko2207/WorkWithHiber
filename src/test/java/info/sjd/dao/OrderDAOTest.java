package info.sjd.dao;

import info.sjd.entity.Cart;
import info.sjd.entity.Good;
import info.sjd.entity.Order;
import info.sjd.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderDAOTest {

    private Good good;
    private User user;
    private Cart cart;
    private Order order;

    @Before
    public void setUp() {
        user = new User();
        user.setLogin("ignatenko2207" + System.currentTimeMillis());
        user.setUserPass("123456");
        user.setFirstName("Alexandr");
        user.setLastName("Ignatenko");
        UserDAO.saveOrUpdate(user);

        good = new Good();
        good.setArticlId(String.valueOf(System.currentTimeMillis()));
        good.setName("test name for good");
        good.setPrice(1599);
        GoodDAO.saveOrUpdate(good);

        cart = new Cart();
        cart.setTimeCreation(System.currentTimeMillis());
        cart.setUser(user);
        CartDAO.saveOrUpdate(cart);

        order = new Order();
        order.setGood(good);
        order.setAmount(15);
        order.setCart(cart);
        OrderDAO.saveOrUpdate(order);
    }

    @After
    public void tearDown() {
        OrderDAO.delete(order);
        CartDAO.delete(cart);
        GoodDAO.delete(good);
        UserDAO.delete(user);
    }

    @Test
    public void saveAndGet() {
        assertNotNull(OrderDAO.get(order.getOrderId()));
        assertNotNull(CartDAO.get(cart.getCartId()));
        assertNotNull(GoodDAO.get(good.getArticlId()));
        assertNotNull(UserDAO.get(user.getLogin()));
    }
}