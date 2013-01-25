package Decorator;

public class Mocha extends CondimentDecorator {
	AbstractDecoratorBeverage beverage;
	
	public Mocha(AbstractDecoratorBeverage beverage){
		this.beverage=beverage;
	}
	
	public double cost(){
		return beverage.cost()+0.99;
	}
	
	public String getDescription(){
		return beverage.getDescription()+",Mocha";
	}

}
