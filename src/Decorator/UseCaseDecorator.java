package Decorator;

public class UseCaseDecorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Order Dark Roast with whip cream and soy milk");
		AbstractDecoratorBeverage darkRoast=new DarkRoastComponent();
		darkRoast=new Whip(darkRoast);
		darkRoast=new Soy(darkRoast);
		
		System.out.println("Total cost of Dark Roastorder is :"+darkRoast.getDescription()+" cost:"+darkRoast.cost());
		
		System.out.println("Order HouseBlend with double mocha , whip cream");
		AbstractDecoratorBeverage houseBlend=new HouseBlendComponent();
		houseBlend=new Mocha(houseBlend);
		houseBlend=new Mocha(houseBlend);
		houseBlend=new Whip(houseBlend);
		
		System.out.println("Total cost of "+houseBlend.getDescription()+" cost :"+houseBlend.cost());

	}

}
