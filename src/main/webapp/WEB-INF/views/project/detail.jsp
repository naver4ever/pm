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

	#content table{
		border: 1px solid #ffffff;
		border-collapse: collapse;
		width: 800px;
		text-align: center;
	}
	
	#content table tr,th,td {
		border: 1px solid #ffffff;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	function popup(){
		var msg = confirm("정말로 삭제하겠습니까?");
		
		if(msg == true){
			location.href="delete?projectno=${ProjectVO.projectno}";
			return true;
		}else{
			return false;
		}
	}
</script>
</head>
<body>

<div id="container">
	<div id="header">
		<a>Project Management System</a><br>
	</div>
	
	<div id="content">
		<table>
			<tr>
				<th>프로젝트 이름</th>
				<td>${ProjectVO.projectname }</td>
			</tr>
			
			<tr>
				<th>프로젝트 내용</th>
				<td>${ProjectVO.projectcontents }</td>
			</tr>
			
			<tr>
				<th>시작 날짜</th>
				<td>${ProjectVO.startdate }</td>
			</tr>
			
			<tr>
				<th>마감 날짜</th>
				<td>${ProjectVO.enddate }</td>
			</tr>
			
			<tr>
				<th>진행 상태</th>
				<td>${ProjectVO.projectstate }</td>
			</tr>
		</table>
		
		<a href="modify?projectno=${ProjectVO.projectno}">수정</a>
		<a href="#" onclick="popup()">삭제</a>
		<a href="list">돌아가기</a>
	</div>
</div>

</body>
</html>