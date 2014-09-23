package edu.lmu.cmsi.gabriel.geometryapi.shape.righttriangle;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint; 

public class RightTriangle{	
	private TwoDPoint pointA;
	private TwoDPoint pointB;
	private TwoDPoint pointC;
	private double base;
	private double height;
	private double hypotenuse;

	public RightTriangle(double base, double height, TwoDPoint origin){
		calculateSideLengths();

		/*if(!isRightTriangle()){
			throw new IllegalArgumentException("must be right triangle");
		}*/
	}

	private void calculateSideLengths(){

	}

	/*private boolean isRightTriangle(){
		double hypotenuse;

		hypotense pointA.distanceToPoint(pointB)

		

		return 

	}*/
}