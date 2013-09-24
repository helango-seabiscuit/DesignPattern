package Bridge.wiki.shape;

public class CircleShape extends AbstractShape {
	
	public CircleShape(DrawingAPI drawingAPI) {
		// TODO Auto-generated constructor stub
		super(drawingAPI);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawingAPI.drawCircle(10);
	}

	@Override
	public void resizeShape() {
		// TODO Auto-generated method stub
		
	}

}
