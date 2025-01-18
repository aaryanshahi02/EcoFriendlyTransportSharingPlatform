package dao;

import model.User;
import org.junit.jupiter.api.*;
import java.sql.SQLException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserDAOTest {
    private static UserDAO userDAO;

    @BeforeAll
    public static void setup() {
        userDAO = new UserDAO();
    }

    @Test
    @Order(1)
    public void testRegisterUser() {
        User user = new User();
        user.setUsername("TestUser");
        user.setEmail("testuser@example.com");
        user.setPassword("password123");

        Assertions.assertDoesNotThrow(() -> userDAO.registerUser(user));
    }

    @Test
    @Order(2)
    public void testGetUserByEmail() throws SQLException {
        User user = userDAO.getUserByEmail("testuser@example.com");
        Assertions.assertNotNull(user, "User should not be null");
        Assertions.assertEquals("TestUser", user.getUsername());
    }
}

