<%@ include file="header.jsp" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

	<display:table name="items" requestURI="" sort="list" pagesize="20" >
		<display:column property="title" title="Title"  />
		<display:column property="category.categoryName" title="Category"  />
		<display:column property="manufacturer" title="Manufacturer"  />
		<display:column property="price" title="Price" sortable="true" />
		<display:column property="stockQuantity" title="Stock Quantity" />
		<display:column value="View" title=" " href="viewItem.action" paramId="itemId" />
		<s:if test="%{admin!=null}">
			<display:column property="id" title="Edit" href="editItem.action" paramId="itemId" />
		</s:if>
	</display:table>

	<s:form>

	</s:form>
</body>
</html>
