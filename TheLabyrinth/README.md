### the labyrinth

aw yea how sick is THIS gonna be

##### to abstract or not to abstract

i made the decision not to use a single abstract class.  this isn't an act of protest or anything.  rather, after i started coding an abstract class, i realized that i could make the program work without them.  in my mind, simplicity trumps all, and while abstract classes have their uses, i thought i could peform the same tasks more succinctly.

in lieu of abstract classes, i turned all game entities into one of two objects: `GameObject` and `GameCharacter`, which extends `GameObject.`

to my understanding, one of the big things about abstract classes (though obviously not the only thing about them) is that they cannot be instantiated.  in my design, i realized i wanted my base game entity classes to be instantiable.  

to that effect, i took inspiration from the Unity3D design engine, which turns every single entity in the engine into a `GameObject.`  all non-moving entities (rocks, trees, walls) are base `GameObjects.`  anything with behavior (players and monsters) is a `GameCharacter`, which inherits all the behaviors from `GameObjects` but adds its own functionality for movement, attack, and health.

players and monsters all share the `dealDamage()` method, but they all deal damage in separate ways.  i didn't want to create separate subclasses just to hold the differentationg `dealDamage()` methods, so instead, i created an enum `Types` that is used as a sort of index for the types of game entities in the program.  the `dealDamage()` method within `GameCharacter` uses if statements compared to the type assigned to the object at instantation to determine the appropriate amount of damage to deal.  

again, i'm not saying this is the best design philosophy in the world.  hell, it may be totally wrong, but a couple if statements in one method in one class seems better organized than creating a whole separate abstract class just for this one behavior.

##### Types.java

all `GameObjects` (and by extensions `GameCharacters`) take an extra parameter for an enum `Type.`  again, this feeds into my whole "good code is documentative" belief.  i wanted a developer to be able to look at `GameEngine.java`, see an object instantation, and be able to tell at a glance what kind of `GameObject` or `GameCharacter` it was.

while creating an enum for this might be overkill, i believe it's the most descriptive choice.  also, i just wanted to get some practice using enums, so i'm looking for any excuse to get it in here.