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

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public boolean validInput(double x, double y){ //public for testing
		return x > 0 && y > 0; //is it okay to be this terse? 
	}
}