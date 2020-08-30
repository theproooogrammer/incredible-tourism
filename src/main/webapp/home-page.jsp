<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@include file="header.jsp"%>

<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Stylish Portfolio - Start Bootstrap Template</title>

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

<body id="page-top">
	<div>
		<br> <br>
		<!-- Portfolio -->
		<section class="content" id="portfolio">
			<div class="container">
				<div class="content-section-heading text-left ">
					<h2 class="font-weight-normal mb-4" style="font-family: serif;">Categories
						Of Travel Destinations</h2>
				</div>

				<!-- using this different style to ierator 2 list simultaneously  -->

				<div class="row no-gutters">
					<c:forEach var="string" items="${desginationDTO.getAllTags}"
						varStatus="status">
						<div class="col-lg-4">
							<a class="portfolio-item"
								href='<c:url value='tag-${string}'></c:url>'>
								<div class="caption">
									<div class="caption-content">
										<div class="h2 font-weight-bold text-capitalize"
											style="font-family: serif;">${string}</div>
										<p class="mb-0"></p>
									</div>
								</div> <img class="img-fluid"
								src="img/${desginationDTO.getRandomImgOnTag[status.index]}"
								alt="">
							</a>
						</div>
					</c:forEach>
				</div>
			</div>
		</section>
	</div>


	<br>
	<br>

	<div>
		<div class=" mr-5 ml-5">
			<ol class="breadcrumb bg-info" style="color: white;">
				<li class="breadcrumb-item active"
					style="color: white; font-family: serif;"><h2>Must Visit
						Places in Pune</h2></li>
			</ol>
		</div>
	</div>
	<br>
	<br>



	<div class="row mr-5 ml-5">
		<c:forEach var="Desgination" items="${desginationDTO.allDesgination }">
			<div class="col-lg-3 col-sm-6 portfolio-item">
				<div class="card h-100">
					<a href="single-item-${Desgination.destName}"><img class="card-img-top"
						src="img/${Desgination.primaryImage}" alt=""></a>
					<div class="card-body">
						<h4 class="card-title" style="font-family: serif;">
							<a href="single-item-${Desgination.destName}">${Desgination.destName}</a>
						</h4>
					</div>
				</div>
			</div>
		</c:forEach>
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

