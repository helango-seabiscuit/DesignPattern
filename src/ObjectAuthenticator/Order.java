package ObjectAuthenticator;

public class Order implements OrderIF{
	
	public void create(String item,int quantity){
		System.out.println(quantity +" units of item "+item +"  has been ordered");
	}

}
