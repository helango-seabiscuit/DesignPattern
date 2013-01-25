package Builder;

public class BuilderPatternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cake cherryCake=new Cake.CakeBuilder().sugar(2).bakingPowder(3).cherry(10).egg(1).flour(4)
		                .cream(1).build();
		System.out.println(cherryCake);

	}

}
