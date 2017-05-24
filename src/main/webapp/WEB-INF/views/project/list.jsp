<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		background-color: #E7E7E7;
		color: #000000;
	}
	
	#container{
		width: 1200px;
		height: 800px;
		margin: 0 auto;
		border: 10px solid #ffffff;
	}

	#header{
		width: 100%;
		height: 150px;
		text-align: center;
		padding: 20px;
	}
	
	#header a{
	font-size: 50px;
	}
	
	#contents table{
		border: 1px solid #ffffff;
		border-collapse: collapse;
		width: 800px;
		text-align: center;
	}
	
	#contents table tr,th,td {
		border: 1px solid #ffffff;
	}
</style>
</head>
<body>
	<div id="container">
		<div id="header">
			<a>Project Management System</a><br>
		</div>
		
		<a href="register">새 프로젝트 등록</a>
		
		<div id="contents">
			<a href=""></a>
		
			<table>
				<tr>
					<th>프로젝트 번호</th>
					<th>프로젝트 이름</th>
					<th>시작 날짜</th>
					<th>종료 날짜</th>
					<th>프로젝트 상태</th>
				</tr>
				
				<c:forEach var="items" items="${list }">
					<tr>
						<td>${items.projectno }</td>
						<td><a href="detail?projectno=${items.projectno}">${items.projectname}</a></td>
						<td>${items.startdate }</td>
						<td>${items.enddate }</td>
						<td>${items.projectstate }</td>
					</tr>
				</c:forEach>
			</table>
		
		</div>
		
		<div id="footer">
			
		</div>
	</div>
	
</body>
</html>