<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
</head>
<body>
<div style="width: 400px; margin:auto">
 <div style="color:green;">
  ${successMsg}
 </div>
 <div style="color:red;">
  ${errorMsg}
 </div>
</div>

<div style="width: 400px; margin:auto; margin-top:100px;">
	<form action="/spSpScUserManageUsingdb/emp/add" method="post">
		<input type="hidden" name="id" value="${employee.id}" />
		 <table>
		  <tr>
		   <td>Username: </td><td><input type="text" name="username" value="${employee.username}" /></td>
		  </tr>
		    <tr>
		   <td>User Role: </td>
		   <td>
		     <select name="userRoleId">
		      <option value="1" >ROLE_ADMIN</option>
		      <option value="2" >ROLE_USER</option>
		     </select>
           </td>
		  </tr>
		   <tr>
		   <td>Full Name: </td><td><input type="text" name="fullName" value="${employee.fullName}" /></td>
		  </tr>
		    <tr>
		   <td>Password: </td><td><input type="text" name="password" value="${employee.password}" /></td>
		  </tr>
		
		   <tr>
		   <td></td>
		   <td><input type="submit" value="Submit"/></td>
		  </tr>
		 </table>
		</form>
</div>



</body>
</html>