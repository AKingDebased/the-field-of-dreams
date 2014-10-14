there's currently nothing handling game objects leaving the bounds of the maze.  if a game object is allowed to move two spaces each update and it happens to go past a wall, the program will explode.


### the labyrinth

aw yea how sick is THIS gonna be

##### abstraction: a journey

this program inititally started with the goal of using no abstract classes.  it wasn't for lack of understanding, i just wanted to see how simple i could keep the code.

the answer: not very simple at all.

as it turns out, i ended up using three abstract classes and a whole slew of additional classes for all the game entities.  the reason for all these myriad classes boils down to one overriding principle: identity

namely, i've found that abstract classes are very useful for giving a group of classes a unified identity.  specifically, all my monsters can be grouped as `Monster` objects.  why bother with this?  it's all because of the `dealDamage()` method.  

##### dealDamage()

as i've said before, i like documentative code.  in order to keep the code as documentative as possible, i opted for a relatively large amount of specific classes.  this was done such that the monsters' `dealDamage` met

