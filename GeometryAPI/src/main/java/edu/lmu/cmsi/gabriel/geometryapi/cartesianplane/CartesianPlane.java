package edu.lmu.cmsi.gabriel.geometryapi.cartesianplane;

import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.linesegment.twodpoint.TwoDPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class CartesianPlane{
	private String name;
	private Scanner userInput = new Scanner(System.in);

	ArrayList<TwoDPoint> individualPoints = new ArrayList<TwoDPoint>();
	//ArrayList<LineSegment> individualLineSegment = new ArrayList<LineSegmnt>();
	//ArrayList<Shape> shapes = new ArrayList<Shape>();

	public CartesianPlane(){
		System.out.println("you've created a grid. please give the grid a name.");
		this.name = userInput.next();
		System.out.println("you have named this grid " + "'" + this.name + "'");
	}

	public void createPoint(double x, double y){
		TwoDPoint newPoint = new TwoDPoint(x,y);

		individualPoints.add(newPoint);
	}

	public double distanceBetweenPoints(TwoDPoint a, TwoDPoint b){
		return Math.sqrt(Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(),2)); //distance formula
	}
}

/*TwoDPoint pointA = new TwoDPoint(1,1);
		TwoDPoint pointB = new TwoDPoint(2,2);

		System.out.println("god?  are you there? it's me again");
		System.out.println(distanceBetweenPoints(pointA, pointB));
		System.out.print(Math.round(1.4142));
		*/