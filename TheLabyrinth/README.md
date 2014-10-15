
### the labyrinth

##### abstraction: a journey

this program inititally started with the goal of using no abstract classes.  it wasn't for lack of understanding, i just wanted to see how simple i could keep the code.

the answer: not very simple at all.

as it turns out, i ended up using three abstract classes and a whole slew of additional classes for all the game entities.  the reason for all these myriad classes boils down to one overriding principle: identity

namely, i've found that abstract classes are very useful for giving a group of classes a unified identity.  specifically, all my monsters can be grouped as `Monster` objects.  why bother with this?  it's all because of the `checkCollision()` and `dealDamage()` method.  

##### checkCollision() and overloading

i had a very bloody and protracted struggle with `checkCollision()`.  initially, the idea was to have one `checkCollision()` method with generic parameters in `Player.java` and `Monster.java` that could be used to detect monster/obstacle and player/obstacle collisions respectively. the issue with that came up with this now method in `Player.java`:

```
public <T extends GameObject> void checkCollision(T target){
	if (getX() == target.getX() && getY() == target.getY()){ 
		if (target instanceof Monster){
			dealDamage(target);
		} else if (target instanceof Obstacle) {
			if(target instanceof Wall){
				this.displacement.invert();
			} else {
				this.hit();
			}
		}
	}
}
```

the problem is on line 4, the `dealDamage(target)` method.  `dealDamage()` was designed to specifically take in an object of type Monster.  because the `checkCollision()` method took in a generic type T, `dealDamage()` would not accept the generic object.  

my fix ended up being overloaded methods.  while this works, it feels kludgey and repetitious. i'm sure there's a better way to fix this, but for the life of me i simply could not figure it out.  please mike megally, you're my only hope.


##### dealDamage()

* as i've said before, i like documentative code.  in order to keep the code as documentative as possible, i opted for a relatively large amount of specific classes.  this was done such that the monsters' `dealDamage()` method could be made to specifically target the `Player` object.  in this way, the method comes with its own implicit error handling.  monsters can't damage monsters because they cannot accept anything but `Player` objects as parameters, and vice versa.  while it does mean i have a large amount of relatively small classes, i find the verbosity pays off in clarity.


##### Obstacle.java

* originally, walls were just Obstacles with a boolean flag ticked.  however, since i was alread elbow deep in classes, i figured i'd just go all in and turn Wall into its own class.  is this the best design choice?  hell if i know.  but it works.

##### Monster.java/MonsterAS.java/MonsterZX.java/BossOK.java

* if two things do the exact same thing but look different, they are essentially the same thing.  for that reason, `MonsterAS` (and all the rest) is a consolidated class that contains both Monster A and S.  when a `MonsterAS` object is instantiated, the developer must enter a `renderedChar` as a parameter.  if that char is invalid (e.g. not 'a' or 's' for MonsterAS), then the program throws an exception


##### concerns and questions

* i gave all GameObjects a `verifyRenderedChar()` method with protected level privacy.  this was done in an effort to give the closest thing to a private method to all child classes.  however, i'm not sure if something like this is totally safe/follows best practices.  if i know all classes are going to have a certain private class, is it best practice to declare that class as protected in the parent?  or should i just implement the class as private throughout all the children without abstractly declaring it as protected?

* i really feel like i went overboard giving absolutely everything its own individual class.  however, i like the readability the individual classes provide in `GameEngine.java`.  it's nice to look at an array and know immediately what game object is inside it.  was i totally wrong in using as many classes as i did?  what is the better design?