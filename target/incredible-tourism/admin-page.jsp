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

<title>Modern Business - Start Bootstrap Template</title>
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

	<div class="container">
		<ol class="breadcrumb bg-info" style="color: white;">
			<li class="breadcrumb-item active"
				style="color: white; font-family: serif;"><h2>Hello Admin!</h2></li>
		</ol>
	</div>


	<div class="container">
		<div>
			<h3 class="mb-3">
				<a href="<c:url value='/adddestination'/>"
					class="btn bg-warning btn-lg btn-block " role="button"
					style="color: white; font-family: serif; font-size: 30px">ADD
					Destination</a>
			</h3>
			<table class="table table-bordered table-hover">
				<thead class="thead-dark">
					<tr style="font-family: serif; serif; font-size: 18px">
						
						<th scope="col">Destination</th>
						
						<th scope="col">Update</th>
						<th scope="col">Delete</th>
						
					</tr>
				</thead>
				<c:forEach var="Desgination"
					items="${AllDesgination.allDesgination}">
					<tr style="font-family: serif; font-size: 18px">
						
						<td>${Desgination.destName}</td>
						
						<td><a
							href="<c:url value='/edit-destination-${Desgination.id}'/>"
							class="btn btn-outline-success" style="font-family: serif; font-size: 15px" role="button">UPDATE</a></td>
						<td><a
							href="<c:url value='/delete-destination-${Desgination.id}'/>"
							class="btn btn-outline-danger" style="font-family: serif; font-size: 15px" role="button">DELETE</a>
					</tr>
				</c:forEach>

			</table>
		</div>

	</div>
	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded js-scroll-trigger" href="#page-top">
		<i class="fas fa-angle-up"></i>
	</a>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- Plugin JavaScript -->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/stylish-portfolio.min.js"></script>

	<br>
	<br>
	<hr>

	<%@include file="footer.jsp"%>

</body>

</html>

