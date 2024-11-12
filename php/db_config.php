<?php
// db_config.php
$host = 'localhost';
$db = 'eco_transport';
$user = 'root';   // Replace with your database username
$pass = '';       // Replace with your database password

try {
    $pdo = new PDO("mysql:host=$host;dbname=$db", $user, $pass);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Database connection failed: " . $e->getMessage());
}
?>
