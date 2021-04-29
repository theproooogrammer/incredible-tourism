<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Incredible Tourism</title>
<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="vendor/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="css/stylish-portfolio.min.css" rel="stylesheet">

</head>

<body>
	<br>
	<br>


	<div class="container bg-warning border border-warning">

		<div class="content-section-heading text-left "><br>
			<h4 align="center" class="font-weight-normal mb-4"
				style="font-family: serif;">Operation Performed SuccessFully</h4>
		</div>

		<div  ><br>
			<a href="<c:url value="/admin"/>"
				class="btn btn-success btn-lg btn-block active" role="button"
				aria-pressed="true">GO Back To Admin Page</a>
		</div>
	</div>


	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<br>
	<br>
	<hr>

	<%@include file="footer.jsp"%>

</body>

</html>

