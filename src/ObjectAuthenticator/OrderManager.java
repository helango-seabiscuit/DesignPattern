package ObjectAuthenticator;

import javax.naming.AuthenticationException;

public class OrderManager {

	public void createOrder(String item,int qty) throws AuthenticationException{
		AuthManager manager = new AuthManager();
		OrderIF authenticator = manager.getOrderAuthenticator("xYxA");
		authenticator.create(item, qty);
	}
}
