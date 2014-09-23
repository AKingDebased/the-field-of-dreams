package edu.lmu.cmsi.gabriel.geometryapi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import edu.lmu.cmsi.gabriel.geometryapi.linesegment.twodpoint.TwoDPoint;
import edu.lmu.cmsi.gabriel.geometryapi.linesegment.LineSegment;

public class LineSegmentTest{
	
	@Test
    public void slopeTest(){

        //slope of (1,4) and (4,2)
        TwoDPoint pointA1 = new TwoDPoint(1,4);
        TwoDPoint pointB1 = new TwoDPoint(4,2);

        LineSegment testLine1 = new LineSegment(pointA1, pointB1);
        assertEquals(-0.6,testLine1.getSlope(),.1);

        //slope of (1,1) and (8,1), horizontal line
        TwoDPoint pointA2 = new TwoDPoint(1,1);
        TwoDPoint pointB2 = new TwoDPoint(8,1);

        LineSegment testLine2 = new LineSegment(pointA2, pointB2);
        assertEquals(0,testLine2.getSlope(),.1);

        //slope of (1,1) and (1,8), vertical line
        TwoDPoint pointA3 = new TwoDPoint(1,1);
        TwoDPoint pointB3 = new TwoDPoint(1,8);

        LineSegment testLine3 = new LineSegment(pointA3, pointB3);
        assertEquals(0.0,testLine2.getSlope(),.1);

        //slope of (1,1) and (8,8)
        TwoDPoint pointA4 = new TwoDPoint(1,1);
        TwoDPoint pointB4 = new TwoDPoint(8,8);

        LineSegment testLine4 = new LineSegment(pointA4, pointB4);
        assertEquals(1,testLine4.getSlope(),.1);
    }
}
