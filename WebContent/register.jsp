<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<s:head/>
</head>
<body>

<h2>Registration Form</h2>

<s:form action="registerAction">
	<s:textfield name="firstName" label="First Name" />
	<s:textfield name="lastName" label="Last Name"/>
	<s:radio name="gender" label="Gender" list="{'Male', 'Female'}" />
	<s:textfield name="age" label="Age" />
	<s:textfield name="email" label="Email" />
	<s:textarea name="address" label="Address" cols="30" rows="4" />
	<s:select list="colors" name="selectedColor" headerKey="None" headerValue="Select a color" label="Favourite color" />
	<s:checkbox name="subscription" value="true" label="Subscribe to our newsLetter" />
	<s:checkboxlist list="hobbies" name="selectedHobbies" label="Hobbies" />
	<s:reset value="reset"/>
	<s:submit value="Register" />
</s:form>

</body>
</html>