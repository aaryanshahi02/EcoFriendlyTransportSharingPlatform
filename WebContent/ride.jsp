<%@ include file="header.jsp" %>
<section>
    <h2>Book a Ride</h2>
    <form action="BookRideServlet" method="post">
        <label for="pickup">Pickup Location:</label>
        <input type="text" id="pickup" name="pickup" required>

        <label for="drop">Drop Location:</label>
        <input type="text" id="drop" name="drop" required>

        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required>

        <button type="submit" class="btn">Book Ride</button>
    </form>
</section>
<%@ include file="footer.jsp" %>
