package edu.lmu.cmsi.gabriel.geometryapi.linesegment;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;

public class LineSegment{
	private TwoDPoint pointA;
	private TwoDPoint pointB; 
	
	public LineSegment(TwoDPoint pointA, TwoDPoint pointB){
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public TwoDPoint getMidpoint(){
		double midpointX = (pointA.getX() + pointB.getX()) / 2;
		double midpointY = (pointA.getY() + pointB.getY()) / 2;

		TwoDPoint midpoint = new TwoDPoint(midpointX, midpointY);
		return midpoint;
	}

	public double getLength(){
		double length = pointA.distanceToPoint(pointB);
		return length;
	}

	public double getSlope(){
		double slope = (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
		return slope;
	}

	public boolean equalToLineSeg(LineSegment lineSegment){
		return this.getLength() == lineSegment.getLength();
	}

	/*public boolean intersectsLineSeg(LineSegment lineSegment){
		uuuuuuuuuuhhhhhhhhhhhhhhhhhhhhhhhhhh
	}*/
}
