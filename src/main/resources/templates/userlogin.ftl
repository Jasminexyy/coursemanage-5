<!DOCTYPE html>
<html lang="ch">
<head style="font-size:35px">
    <link href="/css/userlogin.css" type="text/css" rel="stylesheet">
    <meta name="viewport" content="width=device-width,user-scale=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0" charset="GB2312">
    <title>登录</title>
</head>
<body>
<center>
    <div id="header">
        <span>X</span>
        <center>课堂管理系统登录</center>
    </div>
    <form action="/login" method="post">
    <input type="text" name="account" value="用户名" onfocus="this.value='';this.onfocus='';"/><br/>
    <input type="password" name="password" value="登录密码" onfocus="this.value='';this.onfocus='';"/><br/>
    <button type="submit">登 录</button></br>
    </form>
    <p>忘记密码</p>
    <div id="bottom">
        初次登陆默认密码为123456
    </div>
</center>
</body>
</html>
