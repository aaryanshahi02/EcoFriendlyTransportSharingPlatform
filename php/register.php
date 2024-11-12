<?php
// register.php
include 'db_config.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $username = $_POST['username'];
    $email = $_POST['email'];
    $password = password_hash($_POST['password'], PASSWORD_BCRYPT);

    $stmt = $pdo->prepare("INSERT INTO users (username, email, password) VALUES (?, ?, ?)");
    if ($stmt->execute([$username, $email, $password])) {
        echo json_encode(['status' => 'success', 'message' => 'Registered successfully!']);
    } else {
        echo json_encode(['status' => 'error', 'message' => 'Registration failed.']);
    }
}
?>
