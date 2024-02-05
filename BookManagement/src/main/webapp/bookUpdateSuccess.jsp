<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Update</title>
</head>
<body>

    <h2>Book Update Successful!</h2>

    <p>Thank you for updating. Book information updated successfully.</p>
    <% Integer bookId = (Integer) request.getAttribute("bookId"); %>
    <h4>You updated Book <%= bookId %></h4>

</body>
</html>
