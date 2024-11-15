package com.ecotransport.dao;

import com.ecotransport.Config;
import com.ecotransport.model.Vehicle;
import java.sql.*;

public class VehicleDAO {
    public void addVehicle(Vehicle vehicle) {
        String sql = "INSERT INTO Vehicle (model, type, owner_id) VALUES (?, ?, ?)";
        try (Connection conn = Config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, vehicle.getModel());
            stmt.setString(2, vehicle.getType());
            stmt.setInt(3, vehicle.getOwnerId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
