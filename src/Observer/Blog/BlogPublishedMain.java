package Observer.Blog;

public class BlogPublishedMain {

	public static void main(String[] args) {
		Blog blog = new Blog();
		Subscriber subOne = new Subscriber(blog,"hema","hema@gmail.com");
		Subscriber subTwo = new Subscriber(blog,"Anu","anu@yahoo.com");
		Subscriber subThree = new Subscriber(blog,"Kalai","kalai@redp.com");
		blog.postNewArticle("Node.js", "Lets learn our new Node.js...exciting");
		
		 

	}

}
