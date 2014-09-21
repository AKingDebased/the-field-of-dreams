package edu.lmu.cmsi.gabriel.geometryapi;

import java.util.ArrayList;
import java.util.Scanner;
import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;
import edu.lmu.cmsi.gabriel.geometryapi.linesegment.LineSegment;
import edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle.Rectangle;
//import edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle.square.Square;
//import edu.lmu.cmsi.gabriel.geometryapi.shape.circle.Circle;
//import edu.lmu.cmsi.gabriel.geometryapi.shape.righttriangle.RightTriangle;

public class App{
	//arraylists to hold plane elements
	static ArrayList<TwoDPoint> individualPoints = new ArrayList<TwoDPoint>();
	static ArrayList<LineSegment> individualLineSegments = new ArrayList<LineSegment>();
	static ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	//static ArrayList<Square> squares = new ArrayList<Square>();
	//static ArrayList<RightTriangle> rightTriangles = new ArrayList<RightTriangle>();
	//static ArrayList<Circle> circles = new ArrayList<Circle>();
	static Scanner userInput = new Scanner(System.in);
	static boolean isRunning = true;

	
	public static void main(String[]args){
		System.out.println("welcome to the text based cartesian coordinate grid."
			+ " type 'exit' at anytime to do just that.");

		while(isRunning){
			System.out.println("\nwhat would you like to do?");
			System.out.println("\na)create a new point " + "\nb)create a new line segment" + 
				"\nc)create a new shape\n");
			System.out.println("for additional behavior for specific plane members," +
			 	" enter one of the following:");
			System.out.println("point\nline segment\nshape");


			String userSelection = userInput.next();

			if(userSelection.equalsIgnoreCase("exit")){
				System.out.println("goodbye.");
				isRunning = false;
				break;
			}

			if(userSelection.equalsIgnoreCase("a")){
				double x;
				double y;

				System.out.print("where would you like the point?\nx: ");
				x = userInput.nextDouble();
				System.out.print("y: ");
				y = userInput.nextDouble();

				createPoint(x,y);

				TwoDPoint createdPoint = individualPoints.get(individualPoints.size() - 1);
				System.out.println("you've created a point at (" + createdPoint.getX() + ", " + 
					createdPoint.getY() + ")" );
					 
			}
		}
	}	

	public static void createPoint(double x, double y){
		TwoDPoint newPoint = new TwoDPoint(x,y);

		individualPoints.add(newPoint);
	}

	public static void createLineSeg(TwoDPoint a, TwoDPoint b){
		//working on it
	}

	public static void createRectangle(double width, double height, TwoDPoint origin){
		//working on it
	}

}