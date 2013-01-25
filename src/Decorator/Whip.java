package Decorator;

public class Whip extends CondimentDecorator {
	
	AbstractDecoratorBeverage beverage;
	
	public Whip(AbstractDecoratorBeverage beverage){
		this.beverage=beverage;
		
	}
	
	public double cost(){
		return beverage.cost()+0.50;
	}
	
	public String getDescription(){
		return beverage.getDescription()+", Whip";
	}

}
