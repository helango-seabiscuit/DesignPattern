package Adapter;


//converts Turkey to Duck Adapter
public class DuckConvertingAdapter implements Duck {

	Turkey turkeyExcess;
	public DuckConvertingAdapter(Turkey turkey){
		this.turkeyExcess=turkey;
	}
	@Override
	public void quack() {
		turkeyExcess.wobble();
		
	}
	@Override
	public void fly() {
		turkeyExcess.run();
		
	}
	@Override
	public void swim() {
		//
	}
}
