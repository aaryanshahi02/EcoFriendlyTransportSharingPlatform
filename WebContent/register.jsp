<%@ include file="header.jsp" %>
<section>
    <h2>Register/Login</h2>
    <form action="RegisterServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <button type="submit" class="btn">Register</button>
    </form>
</section>
<%@ include file="footer.jsp" %>
