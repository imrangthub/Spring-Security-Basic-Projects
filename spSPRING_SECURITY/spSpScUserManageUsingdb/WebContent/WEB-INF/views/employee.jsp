<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
 
<title>${title }</title>

</head>
<body>
<h1 align="center">${msg}</h1><hr>

<table style="width:60%; margin:auto">
 <tr>
  <td> <a href="/spSpScUserManageUsingdb/emp/user"> User Dashboard</a></td>
   <td> <a href="/spSpScUserManageUsingdb/emp/admin"> Admin Dashboard</a></td> 
 </tr>
</table>

<br>


  	<c:if test="${pageContext.request.userPrincipal.name != null}">
	   <h2>Role : ${pageContext.request.userPrincipal.name}</h2>
        <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	</c:if>

<br>
<a href="/spSpScUserManageUsingdb/"> Back to Home</a>

</body>
</html>