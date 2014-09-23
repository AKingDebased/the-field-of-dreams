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

		/*if(!isRightTriangle()){
			throw new IllegalArgumentException("must be right triangle");
		}*/
	}

	private double getArea(){
		return base * height * 0.5;
	}

	public Rectangle getBoundingRectangle(){
		Rectangle boundingRectangle = new Rectangle(this.base, this.height, this.origin);

		return boundingRectangle; // in the case of rectangles and squares, the bounding rectangle is the exact same width and height
	}
}