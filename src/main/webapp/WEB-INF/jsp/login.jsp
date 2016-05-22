<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>网络地图搜索后台登陆</title>

    <link rel="stylesheet" type="text/css" href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="../css/login.css" />
    <script type="text/javascript" src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
     <script type="text/javascript" src="../js/login.js"></script>
    <script type="text/javascript" src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body>

 <div class="container">
        <div class="card card-container">
            <img id="profile-img" class="profile-img-card" src="../images/avatar.png" />
            <p id="profile-name" class="profile-name-card"></p>
            <form class="form-signin" action="${pageContext.request.contextPath}/validate" method="post">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="username" name="username" class="form-control" placeholder="UserName" value="${user.username }" required autofocus>
                <input type="password" id="password" name="password" class="form-control" placeholder="Password" value="${user.password }" required>
                <div id="remember" class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me">记住密码
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">登    录</button>
            </form><!-- /form -->
            <span><font color="red" id="error">${errorInfo }</font></span>
            <!-- <a href="#" class="forgot-password">
                Forgot the password?
            </a> -->
        </div><!-- /card-container -->
    </div><!-- /container -->
</body>
</html>