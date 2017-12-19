<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 
<title>${title }</title>

</head>
<body>
<h1 align="center">Welcome to Dashboard</h1><hr>
<div style="width: 400px; margin:auto">
 <div style="color:green;">
  ${successMsg}
 </div>
 <div style="color:red;">
  ${errorMsg}
 </div>
</div>

<div style="width:800px; margin:auto; border:2px">
 <h4>Current User List</h4>
 <table>
  <tr>
   <td>User name</td><td>Role</td><td>Full name</td><td>Action</td>
  </tr>
  		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.username}"/></td>
				<td><c:out value="${employee.userRoleId}"/></td>
				<td><c:out value="${employee.fullName}"/></td>
				<td>
				<a href="edit/${employee.id}"> Edit</a> | 
				<a href="delete/${employee.id}">Delete</a>
				</td>
			</tr>
		</c:forEach>

 </table>
</div>

<a href="/spSpScUserManageUsingdb/emp/create"> Add Employee</a>
<br>

<a href="/spSpScUserManageUsingdb/emp/"> Back</a>
</body>
</html>