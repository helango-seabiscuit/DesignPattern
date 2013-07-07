package EffectiveJava_Item74;

import java.util.concurrent.atomic.AtomicReference;

//Nonserializable stateful class allowing serializable subclass
public abstract class AbstractFoo {

	private int x,y;
	
	//These methods provide access to internal state so it can 
	//be manually serialized by subclass's writeObject method
	protected int getX() {
		checkInit();
		return x;
	}

	protected int getY() {
		checkInit();
		return y;
	}

	//used to track initialization
	private enum State {
		NEW,
		INITIALIZING,
		INITIALIZED
	    };
	    
	private final AtomicReference<State> init=new AtomicReference<State>(State.NEW);
	
	public AbstractFoo(int x,int y){
		initialize(x,y);
	}
	
	//constructor and method allow subclass's readobject method to initialize 
	//our state
	protected AbstractFoo(){}
	
	protected final void initialize(int x,int y){
		if(!init.compareAndSet(State.NEW, State.INITIALIZED)){
			throw new IllegalStateException("Already Initialized");}
			
			this.x = x;
			this.y = y;
			init.set(State.INITIALIZED);
			
		}
	
	private void checkInit(){
		if(init.get()!=State.INITIALIZED)
			throw new IllegalStateException("Uninitialized");
	}
	
}
