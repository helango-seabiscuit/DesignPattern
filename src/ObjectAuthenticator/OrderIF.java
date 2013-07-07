package ObjectAuthenticator;

import javax.naming.AuthenticationException;

public interface OrderIF {

	public void create(String item,int quantity) throws AuthenticationException;
}
