package Template;

public abstract class CaffeineBeverage {
	
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(isUserNeedCondiments())
		   addCondiments();
		
	
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	public final void boilWater(){
		System.out.println("Boiling Water");
	}		
	
	public void pourInCup(){
		System.out.println("Pour into cup");
	}
	
	public boolean isUserNeedCondiments(){
		return true;
	} //dummy concrete method
	     
	

}
