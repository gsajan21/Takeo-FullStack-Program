<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
</head>
<body>
    <h2>Add Book</h2>
    <!-- Add form to input book details and submit to BookOrderOrUpdateServlet -->
    <form action="adminServlet" method="post">
        <!-- Add book input fields (title, author, price, etc.) -->
        <!-- Example: -->
        Title: <input type="text" name="title"><br>
        Author: <input type="text" name="description"><br>
        Price: <input type="text" name="price"><br>
        <!-- Add other fields as needed -->

        <input type="submit" value="Add Book">
    </form>
</body>
</html>
