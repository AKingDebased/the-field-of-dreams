package edu.lmu.cmsi.gabriel.geometryapi.linesegment;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;

public class LineSegment{
	private double length;
	private TwoDPoint pointA;
	private TwoDPoint pointB; 
	private TwoDPoint midpoint; //do we need this as a declared variable?

	public LineSegment(TwoDPoint pointA, TwoDPoint pointB){
		this.pointA = pointA;
		this.pointB = pointB;

		calculateMidpoint();
		calculateLength();
	}

	public TwoDPoint getMidpoint(){
		return midpoint;
	}

	public double getLength(){
		return pointA.distanceToPoint(pointB);
	}

	public boolean equalToLineSeg(LineSegment lineSegment){
		return this.getLength() == lineSegment.getLength();
	}

	/*public boolean intersectsLineSeg(LineSegment lineSegment){

	}*/

	private void calculateMidpoint(){
		double midpointX = (pointA.getX() + pointB.getX()) / 2;
		double midpointY = (pointA.getY() + pointB.getY()) / 2;

		this.midpoint = new TwoDPoint(midpointX, midpointY);
	}

	private void calculateLength(){

	}

}
