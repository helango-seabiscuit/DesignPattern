package ObjectAuthenticator;

import javax.naming.AuthenticationException;

public class OrderAuthenticator implements OrderIF {
  //private OrderManager client;
  private String accessCode;
  private String clientCode;
  
  public OrderAuthenticator(String aCode,String cCode){
	  accessCode = aCode;
	  clientCode = cCode;
  }
  
  public void create(String item,int qty) throws AuthenticationException{
	  if(clientCode.equals(accessCode)){
		  Order ord = new Order();
		  ord.create(item, qty);
	  }else{
		  throw new AuthenticationException("AccessCode didnt match");
	  }
  }
}
