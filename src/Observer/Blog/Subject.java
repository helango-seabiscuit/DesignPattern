package Observer.Blog;

public interface Subject {
	
	public void regisgterObserver(Observer observer);
	
	public void unregisterObserver(Observer observer);
	
	public void notifyObserver();	
}
