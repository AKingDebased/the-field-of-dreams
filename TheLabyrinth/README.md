
### the labyrinth

##### abstraction: a journey

this program inititally started with the goal of using no abstract classes.  it wasn't for lack of understanding, i just wanted to see how simple i could keep the code.

the answer: not very simple at all.

as it turns out, i ended up using three abstract classes and a whole slew of additional classes for all the game entities.  the reason for all these myriad classes boils down to one overriding principle: identity

namely, i've found that abstract classes are very useful for giving a group of classes a unified identity.  specifically, all my monsters can be grouped as `Monster` objects.  why bother with this?  it's all because of the `dealDamage()` method.  

##### dealDamage()

* as i've said before, i like documentative code.  in order to keep the code as documentative as possible, i opted for a relatively large amount of specific classes.  this was done such that the monsters' `dealDamage()` method could be made to specifically target the `Player` object.  in this way, the method comes with its own implicit error handling.  monsters can't damage monsters because they cannot accept anything but `Player` objects as parameters, and vice versa.  while it does mean i have a large amount of relatively small classes, i find the verbosity pays off in clarity.


##### Obstacle.java

* the only thing that separates walls from trees and rocks is that they do no damage (and have a different rendered character).  thus, i didn't want to create a whole new class just for walls.  compromise: i created an `isWall` boolean flag.


##### known bugs

* there's currently nothing handling game objects leaving the bounds of the maze.  if a game object is allowed to move two spaces each update and it happens to go past a wall, the program will explode.

##### concerns and questions

* i gave all GameObjects a `verifyRenderedChar()` method with protected level privacy.  this was done in an effort to give the closest thing to a private method to all child classes.  however, i'm not sure if something like this is totally safe/follows best practices