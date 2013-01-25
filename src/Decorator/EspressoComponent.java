package Decorator;

public class EspressoComponent extends AbstractDecoratorBeverage {
	
	public double cost(){
		return .98;
	}
	
	public String getDescription(){
		description="Espresso";
		return description;
	}

}
