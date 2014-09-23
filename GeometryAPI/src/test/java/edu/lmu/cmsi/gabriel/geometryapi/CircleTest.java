package edu.lmu.cmsi.gabriel.geometryapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;
import edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle.Rectangle;
import edu.lmu.cmsi.gabriel.geometryapi.shape.circle.Circle;

public class CircleTest{
	
	@Test
    
    public void areaTest(){
    	//area for circle at (10,10) with radius 5
    	Circle circle1 = constructCircle(10,10,5);
    	assertEquals(78.54, circle1.getArea(),.01);
	}

     private Circle constructCircle(double originX, double originY, double radius){
        TwoDPoint originPoint = new TwoDPoint(originX,originY);
        Circle circle = new Circle(originPoint, radius);

        return circle;
    }
}