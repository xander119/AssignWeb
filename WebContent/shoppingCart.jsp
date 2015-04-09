<%@ include file="header.jsp" %>
	<h2>Shopping Card Example</h2>
<div >
    <table class="table">
        <tr>
            
            <th>Description</th>
            <th>Qty</th>
            <th>Cost</th>
            <th>Total</th>
            <th></th>
        </tr>
        <s:iterator value="cart" status="status" >
        <tr >
            <td><s:property value="item.title" /></td>           
            <td><s:property value="quantity" /></td>
            <td><s:property value="totalPrice" /></td>
            <td>
            <s:form action="deleteFromCart">
						<s:hidden name="itemSelectId" value="%{#status.index}"/>
						[<s:submit type="button">Delete</s:submit>]
					</s:form>
            </td>
        </tr>
        </s:iterator>
        <tr>
            <td>Total:</td>
            <td></td>
        </tr>
    </table>
</div>
	

</body>
</html>