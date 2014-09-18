package edu.lmu.cmsi.gabriel.geometryapi;

import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.CartesianPlane;
import java.util.ArrayList;
import java.util.Scanner;

//testing packages
import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.linesegment.twodpoint.TwoDPoint;
import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.linesegment.LineSegment;

public class App{
	static ArrayList<CartesianPlane> planes = new ArrayList<CartesianPlane>();
	static Scanner userInput = new Scanner(System.in);
	static boolean isRunning = true;

	
	public static void main(String[]args){
		testing();
		/*System.out.println("welcome to the text based cartesian coordinate grid.  type 'exit' at anytime to do just that.");

		while(isRunning){
			System.out.println("\nwhat would you like to do?");
			System.out.println("\na)create a new grid\nb)delete an existing grid\nc)create a new point " + 
				"\nd)create a new line segment\ne)create a new shape\n");
			System.out.println("for additional behavior for specific plane members, enter one of the following:");
			System.out.println("point\nline segment\nshape");


			String userSelection = userInput.next();

			if(userSelection.equalsIgnoreCase("exit")){
				System.out.println("goodbye.");
				isRunning = false;
				break;
			}

			if(userSelection.equalsIgnoreCase("a")){
				createPlane(); 
			}*/
	}	

	private static void testing(){

		//midpoint test
		TwoDPoint a = new TwoDPoint(4,1);
		TwoDPoint b = new TwoDPoint(5,2);
		TwoDPoint c = new TwoDPoint(7,4);
		TwoDPoint d = new TwoDPoint(8,5);
		LineSegment lineSeg = new LineSegment(a,b);
		LineSegment lineSeg2 = new LineSegment(c,d);
		
		System.out.println("midpoint between (1,1) and (2,2) is " + "(" + lineSeg.getMidpoint().getX() +
			", " + lineSeg.getMidpoint().getY() + ")");
		
		//line segment equality testing
		System.out.print("are the two line segments equal in length? " + lineSeg.equalToLineSeg(lineSeg2));

	}

	private static void createPlane(){
		CartesianPlane newPlane = new CartesianPlane();
		planes.add(newPlane);
	}
}