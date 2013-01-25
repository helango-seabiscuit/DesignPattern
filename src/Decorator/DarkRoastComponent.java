package Decorator;

public class DarkRoastComponent  extends AbstractDecoratorBeverage{
	
	public String getDescription(){
		description="DarkRoast ";
		return description;
	}
	
	public double cost(){
		return 1.99;
	}

}
