### integer binary search tree

##### what a long strange trip it's been

* and here we are at the final assignment.  before anything else, i just want to note that binary search trees are well established in the world of computer science. as a result, much of what i wrote might seem kind of derivative.  really, what i'm trying to say is i SWEAR i didn't plagiarize, but there are just certain ways these things are always done (e.g. traversing the tree recursively) and i didn't see the point in changing what works at optimum efficiency.

* the word of law is recursion.  pretty much all of the traversal functions utilize recursion, as the infrastructure of a binary tree is recursive in nature.  we're not reinventing the wheel here, just trying to make it run a little smoother.

* i used java's `Arrays` class to simplify my contains method. that, and also the added simplicity of the arrays my `toInOrder()` method returns.  is that cheating?  i can't rightly say.  does it work?  yes.  is it fast?  hell yes.

* as always, i prefer documentative code over heavily commented code.  all your public methods came with handy comment blocks, and i find the rest of my code to be fairly self evident (though i did write it, i guess)

* i will admit it right now, i lifted a small kludge fix from my good buddy patrick, so if you spot it, well, i stole it.  you got me.