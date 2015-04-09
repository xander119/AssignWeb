package com.esale.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import session.EntityBeanDAOLocal;
import sessionFactory.SessionFactory;
import model.Item;
import model.ItemSelect;

import com.opensymphony.xwork2.ActionSupport;

public class CartCtrl extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ItemSelect itemSelect ;
	private int itemSelectId;
	private int quantity;
	private int itemId;
	private List<ItemSelect> cart = new ArrayList<ItemSelect>();
	private EntityBeanDAOLocal bean = SessionFactory.getSessionBeanInstance();
	private Map<String, Object> session = SessionFactory.getStrutsSessionInstance();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	public String addItemToCart(){
		Item item = bean.getItemById(this.getItemId());
		itemSelect = new ItemSelect();
		itemSelect.setQuantity(this.getQuantity());
		itemSelect.setItem(item);
		double totalPrice = this.getQuantity() * item.getPrice();
		itemSelect.setTotalPrice(totalPrice);
		
		if(session.containsKey("cart")){
			cart = (List<ItemSelect>) session.get("cart");
			session.remove("cart");
		}
		cart.add(itemSelect);
		session.put("cart", cart);
		
		return SUCCESS;
	}
	
	public String delete(){
		if(session.containsKey("cart")){
			cart = (List<ItemSelect>) session.get("cart");
			session.remove("cart");
		}
		cart.remove(this.getItemSelectId());
		session.put("cart", cart);
		return SUCCESS;
	}

	public ItemSelect getItemSelect() {
		return itemSelect;
	}


	public void setItemSelect(ItemSelect itemSelect) {
		this.itemSelect = itemSelect;
	}



	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public List<ItemSelect> getCart() {
		return cart;
	}


	public void setCart(List<ItemSelect> cart) {
		this.cart = cart;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return the itemSelectId
	 */
	public int getItemSelectId() {
		return itemSelectId;
	}


	/**
	 * @param itemSelectId the itemSelectId to set
	 */
	public void setItemSelectId(int itemSelectId) {
		this.itemSelectId = itemSelectId;
	}
	
}
