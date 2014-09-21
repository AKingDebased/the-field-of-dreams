package edu.lmu.cmsi.gabriel.geometryapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;
import edu.lmu.cmsi.gabriel.geometryapi.shape.rectangle.Rectangle;

public class RectangleTest{
	
	@Test
    public void translateTest(){
        //start at (0,0) and translate by (2,2)
        Rectangle testRectangle = constructRectangle(0,0,1,1);
        testRectangle.translate(2,2);

        assertEquals("failure - expected (2.0,2.0)","(" + 2.0 + "," + 2.0 + ")",
            "(" + testRectangle.getOrigin().getX() + "," + 
            testRectangle.getOrigin().getY() + ")");

        //start at (0,0) and translate by (7,5)
        Rectangle testRectangle2 = constructRectangle(0,0,1,1);
        testRectangle2.translate(7,5);

        assertEquals("failure - expected (7.0,5.0)","(" + 7.0 + "," + 5.0 + ")",
            "(" + testRectangle2.getOrigin().getX() + "," + 
            testRectangle2.getOrigin().getY() + ")");

        //start at (1,1) and translate by (0,-1)
        Rectangle testRectangle3 = constructRectangle(1,1,1,1);
        testRectangle3.translate(0,-1);

        assertEquals("failure - expected (1.0,0.0)","(" + 1.0 + "," + 0.0 + ")",
            "(" + testRectangle3.getOrigin().getX() + "," + 
            testRectangle3.getOrigin().getY() + ")");

       //how do i test for the negative origin coordinate illegal argument exception?
    }

    public void containsPointTest(){
        //test if (3,3) is in 5x5 rectangle
        Rectangle testRectangle = constructRectangle(0,0,5,5);
        TwoDPoint testPoint = new TwoDPoint(3,3);

        assertEquals("failure - expected true", true, testRectangle.containsPoint(testPoint));

        //test if (3,3) is in 2x2 rectangle
        Rectangle testRectangle2 = constructRectangle(0,0,2,2);
        
        assertEquals("failure - expected false", false, testRectangle2.containsPoint(testPoint));
    }

    private Rectangle constructRectangle(double originX, double originY, double width, double height){
        TwoDPoint originPoint = new TwoDPoint(originX,originY);
        Rectangle rectangle = new Rectangle(width,height,originPoint);

        return rectangle;
    }
}