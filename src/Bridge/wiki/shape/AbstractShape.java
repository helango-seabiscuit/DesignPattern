package Bridge.wiki.shape;

public abstract class AbstractShape {
	DrawingAPI drawingAPI;
	AbstractShape(DrawingAPI drawingAPI){
		this.drawingAPI = drawingAPI;
	}
	
	
	public abstract void draw();
	
	public abstract void resizeShape();

}
