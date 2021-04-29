<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
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
<body id="page-top">
	<br>
	<br>
	<!-- Portfolio -->
	<section class="content" id="portfolio">
		<div class="container">

			<ol class="breadcrumb bg-info" style="color: white;">
				<li class="breadcrumb-item text-capitalize "><a
					style="color: white; font-family: serif;"
					href="<c:url value='/homepage'></c:url>">Home</a></li>

				<li class="breadcrumb-item active text-capitalize"
					style="color: white; font-family: serif;">${desginationDTO.primaryTag}</li>
			</ol>

			<div class="content-section-heading text-left">
				<h2 class=" text-capitalize mb-0 " style="font-family: serif;">${desginationDTO.primaryTag}</h2>
				<br>
			</div>

			<div>
				<div class="row">
					<c:forEach var="Desgination"
						items="${desginationDTO.allDesgination }">
						<div class="col-lg-3 col-sm-6 portfolio-item">
							<div class="card h-100">
								<a href="single-item-${Desgination.destName}"> <img
									class="card-img-top" src="img/${Desgination.primaryImage }"
									alt=""></a>
								<div class="card-body">
									<h4 class="card-title" style="font-family: serif;">
										<a href="single-item-${Desgination.destName }">${Desgination.destName }</a>
									</h4>
								</div>
							</div>
						</div>

					</c:forEach>
				</div>

			</div>

		</div>
		</div>
	</section>

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
