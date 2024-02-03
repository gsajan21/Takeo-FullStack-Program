<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Book</title>
</head>
<body>
    <h2>Update Book</h2>
    <!-- Add form to select a book for update and submit to BookOrderOrUpdateServlet -->
    <form action="BookOrderOrUpdateServlet" method="post">
        <!-- Add book selection dropdown or input fields -->
        <!-- Example: -->
        Select Book:
        <select name="bookId">
            <c:forEach var="book" items="${books}">
                <option value="${book.id}">${book.title}</option>
            </c:forEach>
        </select><br>
        <!-- Add other fields as needed -->

        <input type="submit" value="Update Book">
    </form>
</body>
</html>
