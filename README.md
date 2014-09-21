it seems cumbersome that we need to create a point to act as the origin before we can make any shapes

e.g. 

TwoDPoint originPoint = new TwoDPoint(0,0);
Rectangle testRectangle = new Rectangle(1,1,originPoint);
       
the assignment did not explicitly ask for things like vertex points, so a given shape's position on the coordinate plane is based off of its origin point.  this origin point is a private TwoDPoint object variable, which represents the bottom left corner of rectangles & squares, the right angle corner of triangles, and the center of circles.  any translation or point containment functions are keyed off this origin.