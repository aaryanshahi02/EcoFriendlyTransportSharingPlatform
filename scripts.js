function showSection(sectionId) {
    const sections = document.querySelectorAll('.section');
    sections.forEach(section => {
        section.classList.toggle('active', section.id === sectionId);
    });
}

document.addEventListener('DOMContentLoaded', () => {
    showSection('home'); // Default section

    // Ride booking form submission example
    const rideForm = document.getElementById('rideForm');
    rideForm.addEventListener('submit', function(event) {
        event.preventDefault();
        alert('Ride booked successfully!');
    });

    // Register form submission example
    const registerForm = document.getElementById('registerForm');
    registerForm.addEventListener('submit', function(event) {
        event.preventDefault();
        alert('Registered successfully!');
    });
});
// Registration Form Submission
document.getElementById('registerForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const formData = new FormData(this);

    fetch('php/register.php', {
        method: 'POST',
        body: formData
    })
    .then(response => response.json())
    .then(data => {
        alert(data.message);
        if (data.status === 'success') {
            showSection('loginSection');
        }
    })
    .catch(error => console.error('Error:', error));
});

// Login Form Submission
document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const formData = new FormData(this);

    fetch('php/login.php', {
        method: 'POST',
        body: formData
    })
    .then(response => response.json())
    .then(data => {
        alert(data.message);
        if (data.status === 'success') {
            showSection('rideSection');
        }
    })
    .catch(error => console.error('Error:', error));
});

// Ride Booking Form Submission
document.getElementById('rideForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const formData = new FormData(this);

    fetch('php/book_ride.php', {
        method: 'POST',
        body: formData
    })
    .then(response => response.json())
    .then(data => {
        alert(data.message);
    })
    .catch(error => console.error('Error:', error));
});
