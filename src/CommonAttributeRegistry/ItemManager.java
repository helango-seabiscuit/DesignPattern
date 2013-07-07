package CommonAttributeRegistry;

public class ItemManager {
	private CAR car;
	public ItemManager(){
		car = CAR.getCAR();
	}
	
	public String getItemDetails(String item,String category){
		String value = (String)car.createGroup(category).getAttribute(item);
		
		if(value == null){
		  //fetch from DB and populate it in CAR
			String details = "db fetched value";
			CAR.CARGroup group = car.createGroup(category);
			group.setAttribute(item, details);
			value = details;
		}
		return value;
	}

}
