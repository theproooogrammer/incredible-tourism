<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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

<style>
/* Modify the background color */
.navbar-custom {
	background-color: Lavender;
}
/* Modify brand and text color */
.navbar-custom .navbar-brand, .navbar-custom .navbar-text {
	color: green;
}

a {
	font-size: 100%;
}
</style>
</head>

<body id="page-top">
	<!-- Navigation -->
	<div>
		<nav class="navbar navbar-expand navbar-dark bg-info ">
			<h2 style="font-size: 60px; color: white; font-family: serif;">Pune
				Tourism</h2>
		</nav>

		<nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-custom">

			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="container-fluid">
				<div class="collapse navbar-collapse" id="navbarResponsive">


					<ul class="navbar-nav ml-0 ml-lg-0 ">

						<li class="nav-item"
							style="font-size: 20px; color: white; font-family: serif;">
							<a class="nav-link" href="<c:url value='/homepage'></c:url>">Home</a>
						</li>

						<li class="nav-item dropdown"
							style="font-size: 20px; color: white; font-family: serif;"><a
							class="nav-link dropdown-toggle" href="#"
							id="navbarDropdownPortfolio" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false"> Categories </a>

							<div class="dropdown-menu dropdown-menu-right"
								style="font-size: 17px; color: white; font-family: serif;"
								aria-labelledby="navbarDropdownPortfolio">

								<a class="dropdown-item" href="tag-historical places">Historic
									Places</a> <a class="dropdown-item" href="tag-forts">Forts</a> <a
									class="dropdown-item" href="tag-temples">Temples</a> <a
									class="dropdown-item" href="tag-dams">Dams</a> <a
									class="dropdown-item" href="tag-hills">Hills</a> <a
									class="dropdown-item" href="tag-parks">Parks</a>

							</div></li>


						<li class="nav-item dropdown"
							style="font-size: 20px; color: white; font-family: serif;"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdownBlog"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								Gallery </a>
							<div class="dropdown-menu dropdown-menu-right" style="font-size: 17px; color: white; font-family: serif;"
								aria-labelledby="navbarDropdownBlog">
								<a class="dropdown-item" href="portfolio-1-col.html">Historic
									Places</a> <a class="dropdown-item" href="portfolio-2-col.html">Forts</a>
								<a class="dropdown-item" href="portfolio-3-col.html">Temples</a>
								<a class="dropdown-item" href="portfolio-4-col.html">Dams</a> <a
									class="dropdown-item" href="portfolio-4-col.html">Hills</a> <a
									class="dropdown-item" href="portfolio-4-col.html">Parks</a>
							</div></li>


						<li class="nav-item"
							style="font-size: 20px; color: white; font-family: serif;">
							<form action="search" method="get">
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Search for..." name="search" aria-label="Search"
										aria-describedby="basic-addon2">
									<div class="input-group-append">
										<button class="btn btn-dark" type="submit"
											style="background-color: Tomato;">
											<i class="fas fa-search"></i>
										</button>
									</div>
								</div>
							</form>
						</li>

						<li class="nav-item"
							style="font-size: 20px; color: white; font-family: serif;"><a
							class="nav-link" href="services.html">About</a></li>


					</ul>
				</div>
			</div>
		</nav>

	</div>
</body>

</html>

