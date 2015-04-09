<%@ include file="header.jsp" %>

	<s:form action="saveAccount" method="post">

		<s:textarea label="Address" name="account.address"></s:textarea>
		<s:textfield  label="Balance" name="account.balanace"></s:textfield>
		<s:select label="Payment Method" headerKey="-1" headerValue="Select Payment Methods" list="paymentMethods" name="account.paymentMethod" /> 
		<s:submit type="button" value="save"></s:submit>
	</s:form>
</body>
</html>