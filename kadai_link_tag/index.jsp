<%@ page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>kadai_link_tag</title>
	</head>
	<body>
		<!-- 初回リクエストではリンクだけを表示 -->
		<a href="<%= request.getContextPath() %>/link?name=侍太郎">名前「侍太郎」をServletに送信</a>
		<%
			// request属性 `text` があるときだけメッセージを表示 
			String text = (String) request.getAttribute("text");
			if (text != null) {
		%>
			<p><%= text %></p>
		<%
			} 
		%>
	</body>
</html>
