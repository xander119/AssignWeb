<%@ include file="header.jsp"%>


<div class="details">
	<div class="product-details">
		<img alt="" src="">
		<div class="desc span_3_of_2">
			
			<h2><s:property value="item.title"/></h2>
			<img alt="" src="C:/JBOSS/jboss-as-7.1.1.Final/standalone/deployments/userimages/<s:property value="item.image"/>">
			<p>Manufacture : <s:property value="item.manufacturer"/></p>
			<div class="price">
				<p>
					Price: <span><s:property value="item.price"/></span>
				</p>
			</div>
			Available in stock: <s:property value="item.stockQuantity"/>
			<div class="available">
			<s:form action="addToCart">
				<p>Available Options :</p>
				<s:hidden value="%{item.id}" name="itemId"></s:hidden>
				<s:textfield type="number" label="Quantity" name="quantity"></s:textfield>
				<span><s:submit type="button">Add to Cart</s:submit></span>
				</s:form>
			<div class="clear"></div>


		</div>
		<div class="clear"></div>
	</div>
	<div class="product_desc">
		<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
 			<div class="resp-tab-item" aria-controls="tab_item-2" role="tab">Product Reviews</div>
			<div class="clear"></div>
			<h2 >
				Product Reviews
			</h2>
			<div >
			<s:iterator value="reviews" >
				<h4>
					Review by <a href="#">Finibus Bonorum</a>
				</h4>
				
				<p></p>
				</s:iterator>
				<div class="your-review">
					<h3>How Do You Rate This Product?</h3>
					<p>Write Your Own Review?</p>
					<s:form action="submitReview" theme="">
						
						<div>
							<span><label>Review<span class="red">*</span></label></span> <span><s:textarea> </s:textarea></span>
						</div>
						<div>
							<span><input type="submit" value="SUBMIT REVIEW"></span>
						</div>
					</s:form>
				</div>
			</div>
		</div>
	</div>
</div>


</div>

</body>
</html>