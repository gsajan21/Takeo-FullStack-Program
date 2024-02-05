<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.sajan.bookmanagement.model.Book" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update Book</title>
</head>
<style type="text/css">
      body {
                  font-family: Arial, sans-serif;
                  background-color: #f4f4f4;
                  margin: 0;
                  display: flex;
                  justify-content: center;
                  align-items: center;
                  height: 100vh;
              }

              table {
                  width: 70%;
                  border-collapse: collapse;
                  margin: 20px;
              }

              th, td {
                  border: 1px solid #dddddd;
                  text-align: left;
                  padding: 8px;
              }

              th {
                  background-color: #f2f2f2;
              }

              input[type="checkbox"] {
                  transform: scale(1.5);
                  margin-right: 5px;
              }

              input[type="submit"], .order-btn, .update-btn {
                  background-color: #4CAF50;
                  color: white;
                  padding: 10px 15px;
                  border: none;
                  border-radius: 5px;
                  cursor: pointer;
                  margin-right: 10px;
              }

              input[type="submit"]:hover, .order-btn:hover, .update-btn:hover {
                  background-color: #45a049;
              }
    </style>
<body>

    <form action="adminServlet" method="put">
        <table>
            <% Book book = (Book)request.getAttribute("books"); %>

            <input type="hidden" name="id" value="<%= book.getBookId() %>">

            <tr>
                <td>Book Name:</td>
                <td><input type="text" name="bname" value="<%= book.getBookName() %>"></td>
            </tr>

            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" value="<%= book.getBookDescription() %>"></td>
            </tr>

            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" value="<%= book.getBookPrice() %>"></td>
            </tr>

        </table>
        <input type="submit" value="Update" name="update">
    </form>

</body>
</html>
