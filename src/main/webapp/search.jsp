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

	<!-- Page Content -->
	<div class="container">

		<!-- Page Heading/Breadcrumbs -->
		<h1 class="mt-4 mb-3">Searched Result</h1>

		<ol class="breadcrumb">
			<li class="breadcrumb-item text-capitalize"><a
				href="<c:url value='/homepage'></c:url>">Home</a></li>
			<li class="breadcrumb-item active" style="font-family: serif;">Searched
				Item</li>
		</ol>

		<!-- Project One -->

		<c:forEach var="Desgination" items="${search.allDesgination}">
			<div class="row">
				<div class="col-md-4">
					<img class="img-fluid rounded mb-3 mb-md-0"
						src="img/${Desgination.primaryImage}" alt="">
				</div>
				<div class=" ml-5 mt-5 mr-0">
					<h3 style="font-family: serif;">Destination Name :
						${Desgination.destName}</h3>
					<h3 style="font-family: serif;">Location :
						${Desgination.location}</h3>
					<a class="btn btn-primary"
						href="single-item-${Desgination.destName}">View More <span
						class="glyphicon glyphicon-chevron-right"></span>
					</a>
				</div>
			</div>
			<hr>
		</c:forEach>

	</div>

	<br>
	<br>
	<br>

	<div>
		<div class="mr-5 ml-5">
			<ol class="breadcrumb bg-info" style="color: white;">
				<li class="breadcrumb-item active"
					style="color: white; font-family: serif;"><h2>You May
						Also Like :</h2></li>
			</ol>
		</div>

		<br>

		<div class="row mr-5 ml-5">
			<c:forEach var="Desgination" items="${recommendation.allDesgination}">
				<div class="col-lg-3 col-sm-6 portfolio-item">
					<div class="card h-100">
						<a href="single-item-${Desgination.destName}"><img class="card-img-top"
							src="img/${Desgination.primaryImage }" alt=""></a>
						<div class="card-body">
							<h4 class="card-title" style="font-family: serif;">
								<a href="single-item-${Desgination.destName}">${Desgination.destName}</a>
							</h4>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
<br><br><hr>
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
	
	<%@include file="footer.jsp"%>
</body>

</html>
