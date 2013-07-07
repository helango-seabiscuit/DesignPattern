package ObjectAuthenticator;

public class AuthManager {

	public OrderIF getOrderAuthenticator(String clientCode){
		return new OrderAuthenticator("xYxAbC", clientCode);
	}
}
