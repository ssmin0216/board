<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="row" items="${list}">
			<tr>
				<td>${row.bno}</td>
				<td>${row.title}</td>
				<td>${row.regdate}</td>
				<td>${row.writer}</td>
				<td>${row.viewcnt}</td>
			</tr>
		</c:forEach>
			
		</tbody>
	</table>
</body>
</html>