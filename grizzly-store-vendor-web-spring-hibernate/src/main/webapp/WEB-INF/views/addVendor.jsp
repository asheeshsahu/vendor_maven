<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Vendor</title>
</head>
<body>
	<form action="saveVendor" method="post" modelAttribute="vendor">
		vendor_id: <input type="hidden" name="vendor_id" value="${vendor.vendor_id}"><br>
		name: <input type="text" name="name"><br>
		address: <input type="text" name="address"><br>
		contact: <input type="text" name="contact"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>