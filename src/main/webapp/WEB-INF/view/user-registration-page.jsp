<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1 align="center">Please Register Here</h1>

	<form:form action="registration-success" method="GET" modelAttribute="userReg">
		<div align="center">
			<label>User : </label>
			<form:input path="name" />

			<br /> <label>User Name :</label>
			<form:input path="userName" />

			<br /> <label>Password :</label>
			<form:password path="password" />

			<br /> <label>Country :</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India" />
				<form:option value="Usa" label="United State" />
				<form:option value="Pak" label="Pakistan" />
				<form:option value="Sl" label="Sri Lanka" />
			</form:select>

			<br /> <label>Hobbies :</label> Cricket :
			<form:checkbox path="hobbies" value="cricket" />
			Reading :
			<form:checkbox path="hobbies" value="reading" />
			Travel :
			<form:checkbox path="hobbies" value="travel" />
			Programming :
			<form:checkbox path="hobbies" value="programming" />

			<br /> <label>Gender :</label> Male :
			<form:radiobutton path="gender" value="male" />
			Female :
			<form:radiobutton path="gender" value="female" />
			<br /> <input type="submit" value="register">
		</div>
	</form:form>
</body>
</html>