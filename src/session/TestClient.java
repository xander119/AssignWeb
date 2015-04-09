package session;

import java.util.Hashtable;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import model.Account;


public class TestClient {
	
		private static Context context;
		private static EntityBeanDAOLocal sessionBean;

	public static void main(String[] args) {
		

		//Return EJB Session Bean
			try{
				 context = new InitialContext();
				sessionBean = (EntityBeanDAOLocal) context.lookup("EntityBeanDAOLocal/local");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}

	private void run() throws NamingException {
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		env.put(Context.PROVIDER_URL, "127.0.0.1:1099");

		Context context = new InitialContext(env);

		EntityBeanDAOLocal bean = (EntityBeanDAOLocal) context
				.lookup("java:global/AssignmentEAR/AssignEJB/EntityBeanDAO!session.EntityBeanDAOLocal");
		System.out.println(bean.toString());
		Account acc = new Account();
		acc.setAddress("wang");
		acc.setBalance(12.5);
		acc.setPaymentMethod("PayPal");
		bean.createObject(acc);
		for (Account a : bean.getAllAccount()) {
			System.out.print(a.toString());

		}
	}

}
