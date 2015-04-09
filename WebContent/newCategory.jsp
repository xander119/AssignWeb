<%@ include file="header.jsp" %>

	<s:form action="saveCate" method="post">
		<s:textfield name="category.categoryName" label="Category Name"></s:textfield>
		<s:submit type="button" value="Add"></s:submit>
		<s:submit type="button" value="Cancel" action="cancelAction"></s:submit>
		
	</s:form>
</body>
</html>