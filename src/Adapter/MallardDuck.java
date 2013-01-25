package Adapter;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quacking");
		
	}

	@Override
	public void fly() {
        System.out.println("Flying ");
		
	}

	@Override
	public void swim() {
		System.out.println("Swimming");
		
	}

}
