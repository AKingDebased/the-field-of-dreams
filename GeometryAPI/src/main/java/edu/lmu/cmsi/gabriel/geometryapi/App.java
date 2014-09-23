package edu.lmu.cmsi.gabriel.geometryapi;

import edu.lmu.cmsi.gabriel.geometryapi.linesegment.LineSegment;
import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;
import edu.lmu.cmsi.gabriel.geometryapi.shape.circle.Circle;

public class App{
	public static void main(String[]args){
		areaTest();
     
    }

    public static void areaTest(){
    	Circle circle1 = constructCircle(10,10,5);
    	System.out.println(circle1.getArea());
	}

     private static Circle constructCircle(double originX, double originY, double radius){
        TwoDPoint originPoint = new TwoDPoint(originX,originY);
        Circle circle = new Circle(originPoint, radius);

        return circle;
    }
}

