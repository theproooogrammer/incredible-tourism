<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<body>
	<br>

	<div class="container">
		<br>
		<div>
			<ol class="breadcrumb bg-info" style="color: white;">
				<li class="breadcrumb-item active"
					style="color: white; font-family: serif;"><h2>Add
						Destination</h2></li>
			</ol>

		</div>
		<br>
		<div>
			<form action="savedesgination" method="post">

				<div class="form-row">

					<div class="form-group col-md-6">
						<label>Destination</label> <input type="text" class="form-control"
							placeholder="Enter Destination Name" name="destName" required>
					</div>

					<div class="form-group col-md-6">
						<label>Location</label> <input type="text" class="form-control"
							placeholder="Enter Location" name="location" required>
					</div>

				</div>

				<div class="form-row">

					<div class="form-group col-md-12">
						<label>Description</label> <input type="text" class="form-control"
							placeholder="Enter Description" name="description" required>
					</div>

				</div>


				<div class="form-row">

					<div class="form-group col-md-6">
						<label for="exampleFormControlFile1">Primary Image</label> <input
							type="file" class="form-control-file" id="exampleInputFile"
							aria-describedby="fileHelp" name="primaryImage" required>
					</div>

					<div class="form-group col-md-6">
						<label for="exampleFormControlFile1">Other Images</label> <input
							type="file" class="form-control-file" id="exampleInputFile"
							aria-describedby="fileHelp" name="otherImage1" required>
						<input type="file" class="form-control-file" id="exampleInputFile"
							aria-describedby="fileHelp" name="otherImage2" required>
						<input type="file" class="form-control-file" id="exampleInputFile"
							aria-describedby="fileHelp" name="otherImage3" required>
						<input type="file" class="form-control-file" id="exampleInputFile"
							aria-describedby="fileHelp" name="otherImage4" required>
					</div>

				</div>

				<div class="form-row">

					<div class="form-group col-md-12">
						<label>Map</label> <input type="text" class="form-control"
							placeholder="Enter Map Link" name="maps" required>
					</div>

				</div>


				<div class="form-row">

					<div class="form-group col-md-6">
						<label>Primary Tag</label> <input type="text" class="form-control"
							placeholder="Enter Primary Tag" name="primaryTag" required>
					</div>

					<div class="form-group col-md-6">
						<label>Secondary Tag</label> <input type="text"
							class="form-control" placeholder="Enter Secondary  Tag"
							name="secondaryTag" required>
					</div>

				</div>
				<br>
				<div class="ml-1">
					<a style="color: white; font-family: serif;"
						href="<c:url value='/admin'/>" class="btn bg-warning btn-lg"
						role="button">Back</a>

					<button type="submit" class="btn btn-primary btn-lg"
						style="color: white; font-family: serif;">Submit</button>
				</div>
				<br>
			</form>
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