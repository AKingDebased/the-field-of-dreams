package edu.lmu.cmsi.gabriel.geometryapi.shape.righttriangle;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint; 
import edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle.Rectangle;

public class RightTriangle{	
	private TwoDPoint origin;
	private double base;
	private double height;
	private double hypotenuse;

	public RightTriangle(double base, double height, TwoDPoint origin){
		calculateSideLengths();

		this.origin = origin;

		/*if(!isRightTriangle()){
			throw new IllegalArgumentException("must be right triangle");
		}*/
	}

	public Rectangle getBoundingRectangle(){
		Rectangle boundingRectangle = new Rectangle(this.base, this.height, this.origin);

		return boundingRectangle; // in the case of rectangles and squares, the bounding rectangle is the exact same width and height
	}

	private void calculateSideLengths(){

	}

	/*private boolean isRightTriangle(){
		double hypotenuse;

		hypotense pointA.distanceToPoint(pointB)

		

		return 

	}*/
}