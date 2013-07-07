package CommonAttributeRegistry;

import java.util.Hashtable;

public class CAR {
	
	private static CAR car;
	private Hashtable<String,CARGroup> groups;
	
	private CAR(){
		groups = new Hashtable<String,CARGroup>();
	}
	
	public static CAR getCAR(){
		if(car == null)
			car = new CAR();
		return car;
	}
	
	public CARGroup createGroup(String name){
		CARGroup group =  groups.get(name);
		if(group == null){
			group = new CARGroup(name);
			groups.put(name, group);
		}
		return group;
	}
	
	class CARGroup{
		private Hashtable<String,Object> attributes;
		private String name;
		private CARGroup(String grpName){
			name = grpName;
			attributes = new Hashtable<String,Object>();
			
		}
		
		public void setAttribute(String name,Object value){
			attributes.put(name, value);
		}
		
		public Object getAttribute(String name){
			return attributes.get(name);
		}
	}

}
