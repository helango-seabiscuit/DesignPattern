package Decorator;

public class Soy extends CondimentDecorator {
	AbstractDecoratorBeverage beverage;
	
	public Soy(AbstractDecoratorBeverage beverage){
		this.beverage=beverage;
	}
	
	public double cost(){
		return beverage.cost()+.75;
	}
	
	public String getDescription(){
		return beverage.getDescription()+", Soy";
	}

}
