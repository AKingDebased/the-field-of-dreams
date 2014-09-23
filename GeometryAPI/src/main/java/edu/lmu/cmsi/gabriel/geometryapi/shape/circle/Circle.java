package edu.lmu.cmsi.gabriel.geometryapi.shape.circle;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint; 
import edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle.Rectangle;

public class Circle{
	private TwoDPoint center;
	private double radius;

	public Circle(TwoDPoint center, double radius){
		this.center = center;
		this.radius = radius;

		if(!isNotNegative()){
			throw new IllegalArgumentException("all points on the circle must be positive");
		}
	}

	public void translate(double x, double y){
		TwoDPoint newCenter = new TwoDPoint(this.center.getX() + x, this.center.getY() + y);
		this.center = newCenter;
	}

	public boolean containsPoint(TwoDPoint point){ 
		return this.center.distanceToPoint(point) <= this.radius;
	}

	public double getArea(){
		return Math.PI * (Math.pow(radius,2));
	}

	public double getCircumference(){
		return 2 * Math.PI * this.radius;
	}

	public Rectangle getBoundingRectangle(){
		TwoDPoint newOrigin = new TwoDPoint(center.getX() - radius, center.getY() - radius);

		Rectangle boundingRectangle = new Rectangle(this.radius, this.radius, newOrigin);

		return boundingRectangle; 
	}

	private boolean isNotNegative(){
		return this.center.getX() - radius >= 0 && this.center.getY() - radius >= 0; 
	}
}