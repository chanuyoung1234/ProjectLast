<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Insert title here</title>
</head>
<body>
<c:if test=<% request.getParameter("id");%>==${joinuser.id}
&&<% request.getParameter("password");%>==${joinuser.id}>
	<script type="text/javascript">
		alert('로그인에 성공하였습니다.');
		location.href="main.do"
	</script>
</c:if>
<c:if test=<% request.getParameter("id");%>!=${joinuser.id}>
	<script type="text/javascript">
		alert('아이디가 없습니다.회원가입후 이용해주시기를 바랍니다.');
		location.href="joinform.do"
	</script>
</c:if>
<c:if test=<% request.getParameter("password");%>!=${joinuser.password}>
	<script type="text/javascript">
		alert('비밀번호가 다릅니다.');
		history.go(-1);
	</script>
</c:if>

</body>
</html>