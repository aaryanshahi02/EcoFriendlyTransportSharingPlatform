 # Eco-Friendly Transport Sharing Platform

A Java-based eco-friendly transport-sharing platform that allows users to share rides and reduce environmental impact. This project uses JDBC for database connectivity with MySQL and follows the Data Access Object (DAO) design pattern.

## Project Structure

EcoTransport/ ├── src/ │ ├── dao/ │ │ └── UserDAO.java │ ├── model/ │ │ └── User.java │ ├── servlets/ │ │ ├── RegisterServlet.java │ │ ├── LoginServlet.java │ │ └── ProfileServlet.java ├── WebContent/ │ ├── WEB-INF/ │ │ ├── web.xml │ │ └── lib/ │ │ └── jstl.jar │ ├── jsp/ │ │ ├── register.jsp │ │ ├── login.jsp │ │ ├── profile.jsp │ │ └── userlist.jsp │ ├── index.jsp │ ├── header.jsp │ ├── footer.jsp │ ├── styles.css │ ├── scripts.js ├── database/ │ └── schema.sql └── test/ └── dao/ └── UserDAOTest.java

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
