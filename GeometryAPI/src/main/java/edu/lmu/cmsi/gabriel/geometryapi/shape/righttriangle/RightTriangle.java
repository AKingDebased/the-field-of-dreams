package edu.lmu.cmsi.gabriel.geometryapi.shape.righttriangle;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint; 
import edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle.Rectangle;

public class RightTriangle{	
	private TwoDPoint origin;
	private double base;
	private double height;
	
	public RightTriangle(double base, double height, TwoDPoint origin){
		this.origin = origin;
		this.base = base;
		this.height = height;
	}

	public void translate(double x, double y){
		TwoDPoint newOrigin = new TwoDPoint(this.origin.getX() + x, this.origin.getY() + y);
		this.origin = newOrigin;
	}

	/*public boolean containsPoint(TwoDPoint point){
		uuuuuuuuuuuuuhhhhhhhhhhh
	}*/

	public double getArea(){
		return base * height * 0.5;
	}

	public double getPerimeter(){
		double hypotenuse = Math.pow(base,2) + Math.pow(height,2);

		return Math.sqrt(hypotenuse);
	}

	public Rectangle getBoundingRectangle(){
		Rectangle boundingRectangle = new Rectangle(this.base, this.height, this.origin);

		return boundingRectangle; 
	}
}