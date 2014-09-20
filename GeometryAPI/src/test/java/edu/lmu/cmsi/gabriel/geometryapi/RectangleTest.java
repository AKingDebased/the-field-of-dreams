package edu.lmu.cmsi.gabriel.geometryapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.linesegment.twodpoint.TwoDPoint;
import edu.lmu.cmsi.gabriel.geometryapi.cartesianplane.shape.rectangle.Rectangle;

public class RectangleTest{
	
	@Test
    public void translateTest(){
        //start at (0,0) and translate by (2,2)
        TwoDPoint originPoint = new TwoDPoint(0,0);
        Rectangle testRectangle = new Rectangle(1,1,originPoint);
        testRectangle.translate(2,2);

        assertEquals("failure - expected (2.0,2.0)","(" + 2.0 + "," + 2.0 + ")",
            "(" + testRectangle.getOrigin().getX() + "," + 
            testRectangle.getOrigin().getY() + ")");

        //start at (0,0) and translate by (7,5)
        TwoDPoint originPoint2 = new TwoDPoint(0,0);
        Rectangle testRectangle2 = new Rectangle(1,1,originPoint2);
        testRectangle2.translate(7,5);

        assertEquals("failure - expected (7.0,5.0)","(" + 7.0 + "," + 5.0 + ")",
            "(" + testRectangle2.getOrigin().getX() + "," + 
            testRectangle2.getOrigin().getY() + ")");

        //start at (1,1) and translate by (0,-1)
        TwoDPoint originPoint3 = new TwoDPoint(1,1);
        Rectangle testRectangle3 = new Rectangle(1,1,originPoint3);
        testRectangle3.translate(0,-1);

        assertEquals("failure - expected (1.0,0.0)","(" + 1.0 + "," + 0.0 + ")",
            "(" + testRectangle3.getOrigin().getX() + "," + 
            testRectangle3.getOrigin().getY() + ")");

       //how do i test for the negative origin coordinate illegal argument exception?
    }

    public void containsPointTest(){
        
    }
}