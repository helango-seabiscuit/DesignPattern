package Observer.Blog;

import java.util.ArrayList;
import java.util.List;


public class Blog implements Subject{
	
	List<Observer> observers;
	private String topic;
	private String content;
	
	Blog(){
		observers = new ArrayList<Observer>();
	}
	
	public String getTopic() {
		return topic;
	}

	public String getContent() {
		return content;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setContent(String content) {
		this.content = content;
	}	

	@Override
	public void regisgterObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer obs: observers){
			obs.update();
		}
		
	}
	
	
	public void postNewArticle(String topic,String content){
		this.topic = topic;
		this.content = content;
		System.out.println("Posted new article");
		notifyObserver();
	}
	
	

}
