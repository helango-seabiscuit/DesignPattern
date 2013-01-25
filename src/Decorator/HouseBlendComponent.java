package Decorator;

public class HouseBlendComponent extends AbstractDecoratorBeverage {

	
	public double cost(){
		return 1.22;
	}
	
	public String getDescription(){
		description="HouseBlend ";
		return description;
	}
}
