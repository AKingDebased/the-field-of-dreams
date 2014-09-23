package edu.lmu.cmsi.gabriel.geometryapi.linesegment;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;

public class LineSegment{
	private double length;
	private TwoDPoint pointA;
	private TwoDPoint pointB; 
	private TwoDPoint midpoint; 
	//private double slope;

	public LineSegment(TwoDPoint pointA, TwoDPoint pointB){
		this.pointA = pointA;
		this.pointB = pointB;

		calculateMidpoint();
		calculateLength();
		calculateSlope();
	}

	public TwoDPoint getMidpoint(){
		return midpoint;
	}

	public double getLength(){
		return length;
	}

	/*public double getSlope(){
		return this.slope;
	}*/

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
		this.length = pointA.distanceToPoint(pointB);
	}

	/*private void calculateSlope(){
		this.slope = (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
	}*/

}
