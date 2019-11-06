package test.java.ua.nure.itkn179.ponomarenko.usermanagement.db;

import junit.framework.TestCase;
import main.java.ua.nure.itkn179.ponomarenko.usermanagement.User;


public class DaoFactoryTest extends TestCase {
    public void testUserDao() {
        try {
            DaoFactory daoFactory = DaoFactory.getInstance();
            assertNotNull("Dao factory instance is null", daoFactory);
            Dao<User> dao = daoFactory.getUserDao();
            assertNotNull("UserDao instance is null", dao);
        } catch (Exception e) {
            e.printStackTrace();
            fail(e.toString());
        }
    }
}