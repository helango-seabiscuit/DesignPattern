package Decorator;

public abstract class AbstractDecoratorBeverage {
	
	protected String description;
	
	public abstract double cost();
	
	public String getDescription(){
		return description;
	}

}
