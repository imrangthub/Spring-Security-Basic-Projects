<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
 <!-- bootstrap -->
    <spring:url value="/resources/bootstrap/css/bootstrap.min.css" var="bootstrapCss" />
    <spring:url value="/resources/bootstrap/js/bootstrap.min.js" var="bootstrapJs" />
        <spring:url value="/resources/js/jquery-2.1.3.min.js" var="jqueryJs" />
	<link href="${bootstrapCss}" rel="stylesheet" />
	<script src="${jqueryJs}"></script>
    <script src="${bootstrapJs}"></script>
<!-- local -->
    <spring:url value="/resources/css/application.css" var="mainCss" />
    <spring:url value="/resources/imgFolder/been.jpg" var="been" />
	<link href="${mainCss}" rel="stylesheet" />
</head>
<title>${title }</title>
</head>
<body>
<h1 align="center">${msg}</h1><hr>

<table style="width:60%; margin:auto">
 <tr>
  <td> <a href="/spSpScHelloWorldPro/emp/user"> User Dashboard</a></td>
   <td> <a href="/spSpScHelloWorldPro/emp/admin"> Admin Dashboard</a></td> 
   <td><a href="/spSpScHelloWorldPro/"> Back to Home</a> </td>
 </tr>
</table>




<br>


  	<c:if test="${pageContext.request.userPrincipal.name != null}">
	   <h2>Welcome : ${pageContext.request.userPrincipal.name}</h2>
           | <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
	</c:if>
	
	<button id="btn1" class="btn btn-success">Success Btn</button><br>
<div class="col-md-8 col-md-offset-2">
     <img src="${been }" alt="been Image">
</div>


<script>
$(document).ready(function(){
    $("#btn1").click(function(){
        alert("You Click the Botton.");
    });
});
</script>


</body>
</html>