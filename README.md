 # Eco-Friendly Transport Sharing Platform

A Java-based eco-friendly transport-sharing platform that allows users to share rides and reduce environmental impact. This project uses JDBC for database connectivity with MySQL and follows the Data Access Object (DAO) design pattern.

## Project Structure

src ├── com.ecotransport │ ├── Main.java │ ├── Config.java ├── com.ecotransport.model │ ├── User.java │ ├── Vehicle.java │ └── Ride.java └── com.ecotransport.dao ├── UserDAO.java ├── VehicleDAO.java └── RideDAO.java

sql
Copy code

## Database Setup

1. Create a MySQL database named `eco_transport`.


## Configuration
Update Config.java with your MySQL credentials:

public static final String URL = "jdbc:mysql://localhost:3306/eco_transport";
public static final String USER = "yourUsername";
public static final String PASSWORD = "yourPassword";

## Usage
Add a User: Create a User object and use UserDAO.addUser().
Fetch a User: Use UserDAO.getUserById() with the user ID.
Add a Vehicle/Ride: Create Vehicle or Ride objects and use their respective DAO classes.
