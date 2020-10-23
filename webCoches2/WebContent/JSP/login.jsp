<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<meta charset="utf-8">
	<title>Inicia sesión</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../CSS/login.css">
	<script src="../JS/login.js"></script>
	<script>
	$(document).ready(function(){
		$("#SignIn").blur(function(){
			var datos = $("#login").serialize();
			$.ajax({
				type:"POST",
				url:".././Login_srvlt",
				data:datos,
				success: function(r){
					$('#div1').text(r);
				}
			});
			return false;
		});
	});
	</script>
<body>
	<h1>Inicia sesión</h1>
	<form id="login" action=".././Login_srvlt" method="post">
		<input name="id" id="id"><br/>
		<input name="pwd" id="pwd"><br/>
		<input name="SignIn" id="SignIn">
	</form>
	<div id="forget_pwd"><a></a></div>
	<div id="create_count"><a></a></div>
	<div id="div1"></div>
</body>
</html>