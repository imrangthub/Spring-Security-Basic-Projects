<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<title>${title }</title>
</head>
<body>

<div>
  <c:if test="${SPRING_SECURITY_LAST_EXCEPTION  != null} ">
    <div style="color:red">
     Login Failed.<br>
     ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message }
    </div>
  </c:if>
</div> 

<form name='f' action='/spSpScUserManageUsingdb/j_spring_security_check' method='POST'>
  <table style="width:60%; margin:auto">
 <tr>
  <td>User name: </td><td><input type="text" name="j_username" /></td>
 </tr>
 
  <tr>
  <td>Password: </td><td><input type="text" name="j_password" /></td>
 </tr>
 
  <tr>
  <td></td><td><input type="submit" value="Submit" /></td>
 </tr>
</table>
</form>





<br>


  	<c:if test="${pageContext.request.userPrincipal.name != null}">
	   <h2>Welcome : ${pageContext.request.userPrincipal.name}</h2>
           | <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	</c:if>


</body>
</html>