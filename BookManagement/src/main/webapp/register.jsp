<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form Demo</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="register-container">
        <h2>Register Form</h2>

        <form action="register" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <label for="role">Role</label>
            <br>
            <select name ="role" id="role">
                <option>admin</option>

                <option>user</option>
            </select>
            <br>

            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>
