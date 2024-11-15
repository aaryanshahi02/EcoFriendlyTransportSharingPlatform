package com.ecotransport.dao;

import com.ecotransport.Config;
import com.ecotransport.model.User;
import java.sql.*;

public class UserDAO {
    public void addUser(User user) {
        String sql = "INSERT INTO User (name, contact_info, email) VALUES (?, ?, ?)";
        try (Connection conn = Config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getContactInfo());
            stmt.setString(3, user.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getUserById(int userId) {
        String sql = "SELECT * FROM User WHERE user_id = ?";
        try (Connection conn = Config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setContactInfo(rs.getString("contact_info"));
                user.setEmail(rs.getString("email"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

