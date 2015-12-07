<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

	<div class="container">
		<div class="jumbotron">
			<div>
				<h1>Welcome to the Medical Application!</h1>
				<p>To get started, you need to enter your details to sign-up with
					us. Or login to access your details, if you are already registered.</p>
	</div>
		<a class="btn btn-primary" href="<spring:url value="/users.html"/>">Login</a>
	</div>