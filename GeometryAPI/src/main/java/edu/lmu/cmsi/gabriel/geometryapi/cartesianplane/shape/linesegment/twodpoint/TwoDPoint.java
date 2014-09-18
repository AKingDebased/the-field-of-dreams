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

	private boolean validInput(double x, double y){ //public for testing
		return x > 0 && y > 0; //is it okay to be this terse? 
	}
}