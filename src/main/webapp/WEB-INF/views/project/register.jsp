<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</style>
</head>
<body>
	<div id="container">
	<div id="header">
		<a>Project Management System</a><br>
	</div>
	
	<div id="content">
	<form action="register" method="post">
		프로젝트 이름 : <input type="text" name="projectname"><br>
		프로젝트 내용 : <textarea rows="5" cols="21" name="projectcontents"></textarea><br>
		시작 날짜 : <input type="date" name="sdate"><br>
		마감 날짜 : <input type="date" name="edate"><br>
		
		상태 :
		<select name="projectstate">
			<option value="준비">준비</option>
			<option value="진행중">진행중</option>
			<option value="종료">종료</option>
			<option value="보류">보류</option>
		</select><br>
		
		<input type="reset" value="취소">
		<input type="submit" value="저장"> 
	</form>
	</div>
</div>
</body>
</html>