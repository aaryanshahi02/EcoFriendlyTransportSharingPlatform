package com.ecotransport.dao;

import com.ecotransport.Config;
import com.ecotransport.model.Ride;
import java.sql.*;

public class RideDAO {
    public void addRide(Ride ride) {
        String sql = "INSERT INTO Ride (start_location, destination, date, vehicle_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = Config.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ride.getStartLocation());
            stmt.setString(2, ride.getDestination());
            stmt.setString(3, ride.getDate());
            stmt.setInt(4, ride.getVehicleId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

