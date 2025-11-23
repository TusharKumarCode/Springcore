<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #f1f1f1;
        }

        /* Sidebar */
        .sidebar {
            width: 240px;
            height: 100vh;
            background: #2c3e50;
            color: white;
            position: fixed;
            top: 0;
            left: 0;
            padding-top: 40px;
        }

        .sidebar h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        .sidebar a {
            display: block;
            padding: 14px 25px;
            text-decoration: none;
            color: white;
            font-size: 18px;
            transition: 0.3s;
        }

        .sidebar a:hover {
            background: #1abc9c;
        }

        /* Header */
        .header {
            margin-left: 240px;
            padding: 20px;
            background: #34495e;
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        /* Main Content */
        .content {
            margin-left: 240px;
            padding: 30px;
        }

        .card {
            background: white;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 10px;
            box-shadow: 0 0 8px #00000020;
        }
    </style>
</head>
<body>

    <!-- Sidebar -->
    <div class="sidebar">
        <h2>Dashboard</h2>
        <a href="#">Home</a>
        <a href="#">Profile</a>
        <a href="#">Orders</a>
        <a href="#">Settings</a>
        <a href="logout">Logout</a>
    </div>

    <!-- Header -->
    <div class="header">
        <h2>Welcome, User</h2>
        <span>Logged In ✔</span>
    </div>

    <!-- Main Content -->
    <div class="content">
        <div class="card">
            <h3>Overview</h3>
            <p>This is your dashboard overview. You can manage your profile, view orders, and update settings.</p>
        </div>

        <div class="card">
            <h3>Recent Activity</h3>
            <p>No recent activity available.</p>
        </div>
    </div>

</body>
</html>