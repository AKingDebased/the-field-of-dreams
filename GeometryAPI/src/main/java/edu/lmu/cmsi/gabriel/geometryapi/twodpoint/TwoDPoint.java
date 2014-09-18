package edu.lmu.cmsi.gabriel.geometryapi.twodpoint;

public class TwoDPoint{
	private double x;
	private double y;

	public TwoDPoint(double x, double y){
		if(!validInput(x,y)){
			throw new IllegalArgumentException("coordinates must be positive doubles");
		}

		this.x = x;
		this.y = y;
	}

	private boolean validInput(double x, double y){
		return x > 0 && y > 0; //is it okay to be this terse? 
	}
}