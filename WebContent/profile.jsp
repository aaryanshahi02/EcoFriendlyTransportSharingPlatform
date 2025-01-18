<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../header.jsp" %>
<section>
    <h2>Welcome, ${sessionScope.user.username}!</h2>
    <p>Email: ${sessionScope.user.email}</p>
    <a href="logout.jsp" class="btn">Logout</a>
</section>
<%@ include file="../footer.jsp" %>
