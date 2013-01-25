package Builder;

public class Cake {
	
	private double sugar;
	private double butter;
	private double water;
	private int egg;
	private double bakingPowder;
	private double cream;
	private int cherry;
	private double flour;
	private double vanilla;
	
	private Cake(){} //make it private 
	
	public static class CakeBuilder{
		private double sugar;
		private double butter;
		private double water;
		private int egg;
		private double bakingPowder;
		private double cream;
		private int cherry;
		private double flour;
		private double vanilla;
		
		public CakeBuilder sugar(double cups){ this.sugar=cups; return this;}
		public CakeBuilder butter(double cups){ this.butter=cups; return this;}
		public CakeBuilder water(double cups){ this.water=cups; return this;}
		public CakeBuilder egg(int num){ this.egg=num; return this;}
		public CakeBuilder bakingPowder(double cups){ this.bakingPowder=cups; return this;}
		public CakeBuilder cream(double cups){ this.cream=cups; return this;}
		public CakeBuilder cherry(int num){ this.cherry=num; return this;}
		public CakeBuilder flour(double cups){ this.flour=cups; return this;}
		public CakeBuilder vanilla(double cups){ this.vanilla=cups; return this;}
		
		
		public Cake build(){
			return new Cake(this);
		}
		
		
		
		
	}
	private Cake(CakeBuilder builder){
		this.sugar=builder.sugar;
		this.butter=builder.butter;
		this.cherry=builder.cherry;
		this.cream=builder.cream;
		this.egg=builder.egg;
		this.flour=builder.flour;
		this.vanilla=builder.vanilla;
		this.water=builder.water;
		this.bakingPowder=builder.bakingPowder;
	}
	
	public String toString(){
		return "Sugar: "+sugar+" Butter: "+butter+" Cherry: "+cherry;
	}
	

}
