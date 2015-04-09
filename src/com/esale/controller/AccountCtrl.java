package com.esale.controller;

import java.util.ArrayList;
import java.util.List;

import session.EntityBeanDAOLocal;
import sessionFactory.SessionFactory;
import model.Account;

import com.opensymphony.xwork2.ActionSupport;

public class AccountCtrl extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3882460419962503692L;

	List<String> paymentMethods ;
	Account account  = new Account();

	EntityBeanDAOLocal bean = SessionFactory.getSessionBeanInstance();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public String display(){
		paymentMethods = new ArrayList<String>();
		paymentMethods.add("Visa");
		paymentMethods.add("MasterCard");
		paymentMethods.add("PayPal");

		return NONE;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}


	public String newAcc() {
	//	this.getAccount().setCustomer(asdf);
		bean.createObject(this.getAccount());
		return SUCCESS;
	}

	public List<String> getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(List<String> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
}
