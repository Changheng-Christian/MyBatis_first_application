<%--
  Created by IntelliJ IDEA.
  User: Changheng
  Date: 2018-8-18
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html xmlns:margin-left="http://www.w3.org/1999/xhtml" xmlns:margin-right="http://www.w3.org/1999/xhtml">
<head>
    <title>Welcome visitor</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!-- -->
    <script>var __links = document.querySelectorAll('a');function __linkClick(e) { parent.window.postMessage(this.href, '*');} ;for (var i = 0, l = __links.length; i < l; i++) {if ( __links[i].getAttribute('data-t') == '_blank' ) { __links[i].addEventListener('click', __linkClick, false);}}</script>
    <script src="js/jquery.min.js"></script>
    <script>$(document).ready(function(c) {
        $('.alert-close').on('click', function(c){
            $('.message').fadeOut('slow', function(c){
                $('.message').remove();
            });
        });
    });
    </script>
</head>
<body>
<!-- contact-form -->
<div class="message warning">
    <div class="inset">
        <div class="login-head">
            <h1>Login Form</h1>
            <div class="alert-close"> </div>
        </div>
        <form action="" method="post">
            <li>
                <input type="text" class="text" value="Username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}"><a href="#" class=" icon user"></a>
            </li>
            <div class="clear"> </div>
            <li>
                <input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}"> <a href="#" class="icon lock"></a>
            </li>
            <div class="clear"> </div>
            <div class="submit">
                <input type="submit" onclick="myFunction()" value="Sign in" >
                <h4><a href="#">Lost your Password ?</a></h4>
                <div class="clear">  </div>
            </div>

        </form>
    </div>
</div>
</div>
<div class="clear"> </div>
<!--- footer --->
<div class="footer" style="align: center">
    <p style="display:inline;">Copyright &copy;HAND</p>
</div>

</body>
</html>