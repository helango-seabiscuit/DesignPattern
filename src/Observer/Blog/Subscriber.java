package Observer.Blog;

public class Subscriber implements Observer{

	Subject sub;
	String name;
	String email;
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	Subscriber(Blog blog, String name, String email){
		this.sub = blog;
		blog.regisgterObserver(this);
		this.name = name;
		this.email = email;   
	}
	
	private Subject getSub() {
		return sub;
	}

	private void setSub(Subject sub) {
		this.sub = sub;
		
	}

	@Override
	public void update() {
		System.out.println(getName()+" 's email :"+getEmail()+" and emailed following article");
		System.out.println("TOPIC:"+((Blog)getSub()).getTopic());
		System.out.println("CONTENT:"+((Blog)getSub()).getContent());
		//or send email 
		
	}

	@Override
	public void addSubject(Subject subject) {
		sub = subject;
	}

	
}
