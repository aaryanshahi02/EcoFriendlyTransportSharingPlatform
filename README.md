Eco-Friendly Transport Sharing Platform
An eco-friendly transport-sharing platform built to help reduce carbon emissions by connecting users for shared rides. This project allows users to register, log in, and book or offer a ride. Developed using HTML, CSS, JavaScript, PHP, and MySQL.

Table of Contents
Features
Tech Stack
Project Structure
Setup and Installation
Usage
Database Schema
Future Improvements
License
Features
User Registration & Login: Secure registration and login with password hashing.
Ride Booking: Users can book rides by providing pickup, drop location, and date.
How It Works: Describes the benefits and working of the platform.
Responsive Design: Accessible on various devices.
Tech Stack
Frontend: HTML5, CSS3, JavaScript
Backend: PHP, MySQL
Web Server: Apache or Nginx
Project Structure
plaintext
Copy code
eco_transport/
├── index.html           # Main HTML page
├── styles.css           # Styles for the project
├── scripts.js           # JavaScript for interactivity and AJAX requests
├── php/                 # PHP backend scripts
│   ├── db_config.php    # Database configuration
│   ├── register.php     # User registration
│   ├── login.php        # User login
│   └── book_ride.php    # Ride booking
└── README.md            # Documentation
Setup and Installation
Clone the Repository

bash
Copy code
git clone https://github.com/yourusername/eco_transport.git
cd eco_transport
Configure the Database

Create a MySQL database named eco_transport.

Run the following SQL to set up the tables:

sql
Copy code
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE rides (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    pickup VARCHAR(100) NOT NULL,
    drop_location VARCHAR(100) NOT NULL,
    date DATE NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id)
);
Configure Backend (PHP)

Open php/db_config.php.
Set the correct values for $host, $db, $user, and $pass according to your MySQL credentials.
Start Local Server

You can use XAMPP, LAMP, or PHP's built-in server:

bash
Copy code
php -S localhost:8000
Access the Platform

Open your browser and go to http://localhost:8000/eco_transport/index.html.

Usage
Register a New User: Go to "Register/Login" and fill in the registration form.
Login: Log in using registered credentials.
Book a Ride: Go to "Book a Ride," and fill in the required details.
Explore "How It Works": Understand the benefits and working of eco-friendly ride-sharing.
Database Schema
users: Stores user information with hashed passwords.
rides: Stores ride booking information for each user.
Future Improvements
User Profiles: Add profiles to manage and view past rides.
Rating System: Allow users to rate their ride experiences.
Email Notifications: Notify users of booking status via email.
License
This project is licensed under the MIT License - see the LICENSE file for details.
