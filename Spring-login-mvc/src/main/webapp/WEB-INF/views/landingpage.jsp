<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #4a90e2, #9013fe);
            font-family: Arial, sans-serif;
        }

        .login-box {
            width: 350px;
            margin: 120px auto;
            background: #ffffff20;
            padding: 30px;
            border-radius: 12px;
            backdrop-filter: blur(8px);
            color: white;
            box-shadow: 0 0 10px #00000050;
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            font-size: 28px;
        }

        .input-field {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border-radius: 8px;
            border: none;
            outline: none;
            background: #ffffff60;
            font-size: 16px;
        }

        .btn {
            width: 100%;
            padding: 12px;
            background: #00000090;
            border: none;
            border-radius: 8px;
            margin-top: 10px;
            font-size: 18px;
            color: white;
            cursor: pointer;
            transition: 0.3s;
        }

        .btn:hover {
            background: white;
            color: black;
        }

        .signup-text {
            text-align: center;
            margin-top: 15px;
        }

        .signup-text a {
            color: #ffdd57;
            text-decoration: none;
        }

        .signup-text a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <div class="login-box">
        <h2>Login</h2>

        <form action="validatelogin" method="post">
            <input type="text" class="input-field" name="username" placeholder="Enter Username" required>
            <input type="password" class="input-field" name="password" placeholder="Enter Password" required>

            <button type="submit" class="btn">Login</button>

            <div class="signup-text">
                Don't have an account? <a href="register">Register</a>
            </div>
        </form>
    </div>

</body>
</html>