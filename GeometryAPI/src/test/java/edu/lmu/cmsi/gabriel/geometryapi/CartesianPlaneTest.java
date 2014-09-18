package edu.lmu.cmsi.gabriel.geometryapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.geometryapi.twodpoint.TwoDPoint;

public class CartesianPlaneTest{
	
	@Test
    /*public void validPointTest(){
    	TwoDPoint point = new TwoDPoint(1,1);

    	assertEquals("failure - expected true", true, point.validInput(1,1));

    	assertEquals("failure - expected false",false,point.validInput(-1,1));
    	assertEquals("failure - expected false",false,point.validInput(1,-1));
    	assertEquals("failure - expected false",false,point.validInput(-1,-1));
    }*/

    public void distanceTest(){ //need to establish test parameters for distance
    	CartesianPlane plane = new CartesianPlane();
    	TwoDPoint pointA = new TwoDPoint(1,1);
    	TwoDPoint pointB = new TwoDPoint(2,2);

    	assertEquals("failure - expected 1.4142", Math.round(1.4142), plane.distanceBetweenPoints(pointA, pointB));
    }
}