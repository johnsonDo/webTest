<%--
  Created by IntelliJ IDEA.
  User: jiangdongcheng
  Date: 16/8/8
  Time: 下午8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登录</title>
    <script src="js/jquery.js"></script>
    <script>
        $(function(){
            $("input:eq(2)").click(function(){
                var username = $("input:eq(0)").val();
                var password = $("input:eq(1)").val();
                $.ajax({
                    type : "get",
                    url : "http://localhost:8080/webTest/LoginServlet",
                    data : { name:username , password:password},
                    dataType : "html",
                    success: function(msg){
                        $("body").append(msg);
                    }

                })
            })

        })
    </script>
</head>
<body>

    用户：<input type="text" name="username" /><br/>
    密码：<input type="password" name="password" /><br/>
    <input type="button" value="登录" />
</body>
</html>
