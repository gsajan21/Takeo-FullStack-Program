<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form Demo</title>
</head>
<body>

    <h2>User Registration Successful!</h2>

    <p>Thank you for registering. Your account has been created successfully.</p>
    <% String userId = (String) request.getAttribute("userId"); %>
    <h4><%= userId %></h4>

</body>
</html>
