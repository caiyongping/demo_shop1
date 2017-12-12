<!DOCTYPE html>
<%@ page contentType="text/html; charset=utf-8"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <title>上传资料</title>
</head>
<body>
<div align="center" style="margin-top:150px;">
    <form action="/user/addInfo" method="post">
        姓名：<input type="text" name="name" id="name" vlaue=""/><br/><br/>
        邮箱地址:<input type="text" name="email" id="email" vlaue=""/><br/><br/>
        照片:<input type="text" name="phone" id="phone" vlaue=""/><br/><br/>
        地址:<input type="text" name="addr" id="addr" vlaue=""/><br/><br/>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>