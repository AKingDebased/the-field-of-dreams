package edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.linesegment.twodpoint;

final public class TwoDPoint{
	final private double x;
	final private double y;

	public TwoDPoint(double x, double y){
		if(!validInput(x,y)){
			throw new IllegalArgumentException("coordinates must be positive doubles");
		}

		this.x = x;
		this.y = y;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public double distanceToPoint(TwoDPoint point){
		return Math.sqrt(Math.pow(this.x - point.getX(),2) + Math.pow(this.y - point.getY(),2)); //distance formula
	}

	public boolean equalToPoint(TwoDPoint point){
		return this.x == point.getX() && this.y == point.getY();
	}

	private boolean validInput(double x, double y){ 
		return x >= 0 && y >= 0; //is it okay to be this terse? 
	}
}