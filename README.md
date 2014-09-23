### text based cartesian geometry 

##### TwoDPoint.java

##### LineSegment.java

* for simplicity's sake, the constructor for a line segment requires two previously declared points.  if i had more time (read: was less lazy), i would include functionality for entering coordinate points as parameters and have the `LineSegment` class generate the requisite points.

##### Rectangle.java

##### RightTriangle.java

* due to time (read: being a lazy son of a bitch), i constructed the `RightTriangle` class such that it only takes in base, width, and an origin point.  all of its associated functions automatically treat the triangle as a right triangle based on that information.  as the program is designed, there is no way to make a non-right triangle.  personally, i think it would be counterintuitive to have a `RightTriangle `class that could produce non-right triangles.

##### Circle.java

##### General Notes

* i admit it is cumbersome that a point object has to be passed in as the origin before we can make any shapes

```
TwoDPoint originPoint = new TwoDPoint(0,0);
Rectangle testRectangle = new Rectangle(1,1,originPoint);
```
       
* the assignment did not explicitly ask for things like vertex points, so a given shape's position on the coordinate plane is based off of its origin point.  this origin point is a private `TwoDPoint` object variable, which represents the bottom left corner of rectangles & squares, the right angle corner of triangles, and the center of circles.  any translation or point containment functions are keyed off this origin.


* i have a lingering question about variables and getter functions.  let me phrase the question with an example: in my `Rectangle` class, i added a boolean variable that holds whether or not the rectangle is also a square.  as it stands, i have a getter function that returns the variable `isSquare`.  however, since no other function in the Rectangle class depends upon the `isSquare` variable, could i not just delete the isSquare variable and only keep the isSquare function?  that way, a fellow dev can still determine if a Rectangle is also a square by simply calling the `isSquare()` function, and there's no need to waste memory storing information that is not necessary for the program.

##### BUT WHY DOES IT ALL WORK

because i ran an uncomfortable amount of unit tests across as many cases as my clumsy human brain could come up with that's why



