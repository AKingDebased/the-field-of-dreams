package edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint; 

public class Rectangle{
	private double height;
	private double width;
	private TwoDPoint origin;
	private boolean isSquare;

	public Rectangle(double height, double width, TwoDPoint origin){
		this.height = height;
		this.width = width;
		this.origin = origin;
		this.isSquare = height == width;
	}

	public void translate(double x, double y){
		TwoDPoint newOrigin = new TwoDPoint(this.origin.getX() + x, this.origin.getY() + y);
		this.origin = newOrigin;
	}

	public boolean containsPoint(TwoDPoint point){ 
		return point.getX() <= origin.getX() + this.width && point.getY() <= origin.getY() + this.height;
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

	public boolean isSquare(){
		return this.isSquare;
	}
	
}