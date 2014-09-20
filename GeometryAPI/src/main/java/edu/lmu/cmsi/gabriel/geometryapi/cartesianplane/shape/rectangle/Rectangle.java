package edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.rectangle;

import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.Shape;
import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.linesegment.twodpoint.TwoDPoint; 

public class Rectangle{
	private double height;
	private double width;
	private TwoDPoint origin;

	public Rectangle(double height, double width, TwoDPoint origin){
		this.height = height;
		this.width = width;
		this.origin = origin;
	}

	public void translate(double x, double y){
		TwoDPoint newOrigin = new TwoDPoint(this.origin.getX() + x, this.origin.getY() + y);
		this.origin = newOrigin;
	}

	
	public boolean containsPoint(TwoDPoint point){
		return point.getX() <= this.width && point.getY() <= this.height;
	}

	public double getArea(){
		return width * height;
	}

	public double getPerimeter(){
		return (width * 2) + (height * 2);
	}

	public TwoDPoint getOrigin(){
		return this.origin;
	}
	
}