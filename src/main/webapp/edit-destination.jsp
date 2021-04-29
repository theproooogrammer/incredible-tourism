<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<div class="container">
		<br>
		<div>
			<ol class="breadcrumb bg-info" style="color: white;">
				<li class="breadcrumb-item active"
					style="color: white; font-family: serif;"><h2>Update
						Destination</h2></li>
			</ol>
		</div>
		<br>
		<div>
			<form:form action="update-destination" method="post"
				modelAttribute="destination">

				<div class="form-row">
					<div class="form-group col-md-6">
						<form:input type="hidden" class="form-control" id="id" path="id" />
					</div>
				</div>

				<div class="form-row">

					<div class="form-group col-md-6">
						<label>Destination</label>
						<form:input type="text" class="form-control"
							placeholder="Enter Destination Name" id="destName"
							path="destName" />
					</div>

					<div class="form-group col-md-6">
						<label>Location</label>
						<form:input type="text" class="form-control"
							placeholder="Enter Location" path="location" />
					</div>

				</div>

				<div class="form-row">

					<div class="form-group col-md-12">
						<label>Description</label>
						<form:input type="text" class="form-control"
							placeholder="Enter Description" path="description" />
					</div>

				</div>


				<div class="form-row">

					<div class="form-group col-md-6">
						<label for="exampleFormControlFile1">Primary Image</label>
						<form:input type="file" class="form-control-file"
							id="exampleInputFile" aria-describedby="fileHelp"
							path="primaryImage" />
					</div>

					<div class="form-group col-md-6">
						<label for="exampleFormControlFile1">Other Images</label>
						<form:input type="file" class="form-control-file"
							id="exampleInputFile" aria-describedby="fileHelp"
							path="otherImage1" />

						<form:input type="file" class="form-control-file"
							id="exampleInputFile" aria-describedby="fileHelp"
							path="otherImage2" />

						<form:input type="file" class="form-control-file"
							id="exampleInputFile" aria-describedby="fileHelp"
							path="otherImage3" />

						<form:input type="file" class="form-control-file"
							id="exampleInputFile" aria-describedby="fileHelp"
							path="otherImage4" />

					</div>

				</div>

				<div class="form-row">

					<div class="form-group col-md-12">
						<label>Map</label>
						<form:input type="text" class="form-control"
							placeholder="Enter Map Link" path="maps" />
					</div>

				</div>


				<div class="form-row">

					<div class="form-group col-md-6">
						<label>Primary Tag</label>
						<form:input type="text" class="form-control"
							placeholder="Enter Primary Tag" path="primaryTag" />
					</div>

					<div class="form-group col-md-6">
						<label>Secondary Tag</label>
						<form:input type="text" class="form-control"
							placeholder="Enter Secondary Tag" path="secondaryTag" />
					</div>

					<br>

					<div class="ml-1">
						<a style="color: white; font-family: serif;"
							href="<c:url value='/admin'/>" class="btn bg-warning btn-lg"
							role="button">Back</a>

						<button type="submit" class="btn btn-primary btn-lg"
							style="color: white; font-family: serif;">Update</button>
					</div>
					<br>
				</div>

			</form:form>
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