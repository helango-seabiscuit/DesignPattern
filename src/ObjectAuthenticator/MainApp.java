package ObjectAuthenticator;

public class MainApp {
	
	public static void main(String args[]){
		OrderManager manager = new OrderManager();
		try{
			manager.createOrder("Game of Thrones", 4);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
