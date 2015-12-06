<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<h1>${user.name}</h1>
<c:forEach items="${user.records}" var = "record"> 

	<h1>${record.name}</h1>
	<p>Symptom: ${record.symptom}</p>
	
	<table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>Diagnosis</th>
				<th>Treatment</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${record.items}" var="item">
			<tr>
				<td>${item.title}</td>
				<td>${item.link}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:forEach>