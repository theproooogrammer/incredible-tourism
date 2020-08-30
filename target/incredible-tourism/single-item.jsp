<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
	<br>
	<br>
	<div class="container">

		<ol class="breadcrumb bg-info" style="color: white;">

			<li class="breadcrumb-item text-capitalize"><a
				style="color: white; font-family: serif;"
				href="<c:url value='/homepage'></c:url>">Home</a></li>

			<li class="breadcrumb-item text-capitalize"><a
				style="color: white; font-family: serif;"
				href="<c:url value='/tag-hills'></c:url>">${desginationDTO.primaryTag}</a></li>

			<li class="breadcrumb-item active text-capitalize"
				style="color: white; font-family: serif;">${desginationDTO.destName }</li>
		</ol>

		<!-- Portfolio Item Row -->

		<h2 class="my-2" style="font-family: serif; font-size: 50px">${desginationDTO.destName}</h2>

		<div class="row">
			<div class="col-md-6">
				<img class="img-fluid" src="img/${desginationDTO.primaryImage }"
					alt="">
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="col-md-12">

				<h3 class="my-3" style="font-family: serif;">Description</h3>
				<p style="font-family: serif; font-size: large;">${desginationDTO.description }</p>
				<h5 class="my-3" style="font-family: serif;">Location :
					${desginationDTO.location }</h5>

			</div>

		</div>

		<br>
		<hr>

		<div>
			<h2 class="my-3 text-capitalize" style="font-family: serif;">Images</h2>

			<div class="row">
				<div class="col-md-3 col-sm-6 mb-4">
					<img class="img-fluid" src="img/${desginationDTO.otherImage1}">
				</div>
				<div class="col-md-3 col-sm-6 mb-4">
					<img class="img-fluid" src="img/${desginationDTO.otherImage2}">
				</div>
				<div class="col-md-3 col-sm-6 mb-4">
					<img class="img-fluid" src="img/${desginationDTO.otherImage3}">
				</div>
				<div class="col-md-3 col-sm-6 mb-4" >
					<img class="img-fluid"  src="img/${desginationDTO.otherImage4}">
				</div>
			</div>

		</div>
		<br>
		<hr>
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<h2 class="my-3 text-capitalize" style="font-family: serif;">Google
						Map</h2>
					<div class="col-lg-18 mb-4">
						<!-- Embedded Google Map -->
						<iframe width="100%" height="400px" frameborder="0" scrolling="no"
							marginheight="0" marginwidth="0"
							src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7567.560742652323!2d73.83991297278554!3d18.493604999698604!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2c007d06676ad%3A0xf1c3e7cac53c6661!2sParvati%20Hill!5e0!3m2!1sen!2sca!4v1598201837447!5m2!1sen!2sca"></iframe>
					</div>

				</div>
			</div>
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

