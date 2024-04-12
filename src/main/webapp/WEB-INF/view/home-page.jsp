<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<script type="text/javascript">
	function validateyourName() {
		var yourName = document.getElementById('yn').value;
		if (yourName.length < 3) {
			alert("Your Name Should Have One Character");
			return false;
		} else {
			return true;
		}

	}
</script>

<meta charset="ISO-8859-1">
<title>LoveCalculatorApplication</title>
</head>
<body bgcolor="pink">
	<h1 align="center">Love Calculator</h1>

	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo"
		onsubmit="return <%-- validateyourName() --%>">
		<div align="center">
			<p>
				<label for="yn">Your Name : </label>
				<form:input type="text" id="yn" path="yourName" />
				<form:errors path="yourName" cssClass="error" />
			</p>
			<p>
				<label for="cn">Crush Name : </label>
				<form:input type="text" id="cn" path="crushName" />
				<form:errors path="crushName" cssClass="error" />
			</p>

			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I am agree for these fun</label>
				<form:errors path="termAndCondition" cssClass="error" />
			</p>

			<input type="submit" value="calculate">
		</div>
	</form:form>

</body>
</html>
