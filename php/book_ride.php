<?php
// book_ride.php
include 'db_config.php';
session_start();

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    if (isset($_SESSION['user_id'])) {
        $user_id = $_SESSION['user_id'];
        $pickup = $_POST['pickup'];
        $drop_location = $_POST['drop'];
        $date = $_POST['date'];

        $stmt = $pdo->prepare("INSERT INTO rides (user_id, pickup, drop_location, date) VALUES (?, ?, ?, ?)");
        if ($stmt->execute([$user_id, $pickup, $drop_location, $date])) {
            echo json_encode(['status' => 'success', 'message' => 'Ride booked successfully!']);
        } else {
            echo json_encode(['status' => 'error', 'message' => 'Booking failed.']);
        }
    } else {
        echo json_encode(['status' => 'error', 'message' => 'Please log in to book a ride.']);
    }
}
?>
