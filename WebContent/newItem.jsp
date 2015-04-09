<%@ include file="header.jsp" %>

	<s:form action="saveItem" method="post" enctype="multipart/form-data">
		<s:textfield name="item.title" label="Item Title"></s:textfield>
		<s:select label="Category" name="category" list="displayCate" headerKey="-1" headerValue="Select Category" ></s:select>
		<s:textfield name="item.manufacturer" label="Manufacturer"></s:textfield>
		<s:textfield name="item.price" type="number" label="Item Price"></s:textfield>
		<s:textfield name="item.stockQuantity" type="number" label="Stock Quantity"></s:textfield>
		<s:file name="userImage" label="Choose image to upload" />
		<s:submit type="button" value="Add"></s:submit>
		<s:submit type="button" value="Cancel" action="cancelAction"></s:submit>
	</s:form>
</body>
</html>