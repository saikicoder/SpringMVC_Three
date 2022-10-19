<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Page</title>

</head>
<body>
<h3>Order here</h3>
<form action="${pageContext.request.contextPath}/sendOrder">
<input type="text" name="customerName"/>
<input type="text" name="customerProduct"/>
<input type="submit" name="submit">
</form>
</body>
</html>