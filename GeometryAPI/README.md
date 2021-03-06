### text based cartesian geometry 

##### on comments

* i'm of the opinion that good code should be documentative.  this because a) i tend to overcomment and b) i'll support any philosophy that meshes with my perennial laziness.  with that said, my intention is that you'll find my code's purpose fairly plain even with the relatively minimal amount of comments.  however, if you think i could use more detailed comments, i am totally amenable to that.

##### General Notes

* i admit it is cumbersome that a point object has to be passed in as the origin before we can make any shapes, but for time's (read: laziness') sake, that is the current design philosophy

```
//idiom for creating a rectangle
TwoDPoint originPoint = new TwoDPoint(0,0);
Rectangle testRectangle = new Rectangle(1,1,originPoint);
```
       
* the assignment did not explicitly ask for things like vertex points or edges, so a given shape's position on the coordinate plane is based off of its origin point.  this origin point is a private `TwoDPoint` object variable, which represents the bottom left corner of rectangles & squares, the right angle corner of triangles, and the center of circles.  any translation or point containment functions are keyed off this origin.


* i have a lingering question about variables and getter functions.  let me phrase the question with an example: in my shape classes, values such as `area` and `perimeter` exist only in `getArea()` and `getPerimeter` functions.  that is to say, there is no object variable for `area` or `perimeter` like there is for `base`, `height`, and `origin`.  this choice was made based off the fact that, so far, nothing in the classes depends on `area` and `perimeter`, so it seemed wasteful to declare variables for values that are not necessary for other functions.  however, is there some design reason to create area and perimeter variables even if they are not necessary for the program?

##### TwoDPoint.java

* error handling makes sure to break the program if the user tries to input any negative, non-double values as coordinates.

##### LineSegment.java

* for simplicity's sake, the constructor for a line segment requires two previously declared points.  if i had more time (read: was less lazy), i would include functionality for entering coordinate points as parameters and have the `LineSegment` class generate the requisite points.

```
//idiom for creating a line segment
TwoDPoint pointA = new TwoDPoint(1,1);
TwoDPoint pointB() = new TwoDPoint(5,5);

LineSegment lineSeg = new LineSegment(pointA, pointB);
```

* missing an `intersectsLineSeg()` method due to unexpectedly high levels of geometry and laziness in code.  sorry about that.

* the `getSlope()` method is a relic of previous iterations of this project.  it was left in for fun and profit.

##### Rectangle.java

* it should be noted that there is no separate `Square` class.  rather, any rectangle with an equal `width` and `height` variable will set the `isSquare` boolean to true.


##### RightTriangle.java

* due to time (read: being a lazy son of a bitch), i constructed the `RightTriangle` class such that it only takes in base, width, and an origin point.  all of its associated functions automatically treat the triangle as a right triangle based on that information.  as the program is designed, there is no way to make a non-right triangle.  personally, i think it would be counterintuitive to have a `RightTriangle `class that could produce non-right triangles.

* `RightTriangle` doesn't know which way it is facing.  it is assumed the origin, i.e. the right angle section, is on the bottom left side of the triangle.

* `RightTriangle` does not have a `containtsPoint()` method.  surprise geometry + crunch time = missing functions.  again, sorry about that.  

##### Circle.java

* the `Circle` will throw a fit should the user input a radius and origin combination that would produce negative points anywhere along the circle's circumference.

##### BUT WHY DOES IT ALL WORK

because i ran an uncomfortable amount of unit tests across as many cases as my clumsy human brain could come up with that's why

less flippantly, a myriad of junit tests have been run on and included with all of the classes.  these tests cover as many cases as i could gather up, from the widest edges of possibility to the most likely and mundane. my test cases can be viewed in the test directory of the project.

