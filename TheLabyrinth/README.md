### the labyrinth

aw yea how sick is THIS gonna be

##### to abstract or not to abstract

i made the decision not to use a single abstract class.  this isn't an act of protest or anything.  rather, after i started coding an abstract class, i realized that i could make the program work without them.  in my mind, simplicity trumps all, and while abstract classes have their uses, i thought i could do the same work more succinctly.

##### Types.java

all `GameObjects` (and by extensions `GameCharacters`) take an extra parameter for an enum `Type.`  again, this feeds into my whole "good code is documentative" belief.  i wanted a developer to be able to look at `GameEngine.java`, see an object instantation, and be able to tell at a glance what kind of `GameObject` or `GameCharacter` it was.

while creating an enum for this might be overkill, i believe it's the most descriptive choice.  also, i just wanted to get some practice using enums, so i'm looking for any excuse to get it in here.