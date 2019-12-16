<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body style="background-color: #2BBBAD;" class="text-white">
		<nav class="navbar navbar-dark navbar-expand-lg bg-dark">
			<div class="collapse navbar-collapse">
				<a class="navbar-brand" href="#" onclick="redirecionar(); return false;">Home</a>
			</div>
		</nav>
</body>
</html>

<script>
	function redirecionar(){
		location.href="index.jsp";
	}
</script>