### recursion and the stack

* if ever i reference a closing symbol, take that to mean ) or ]

##### on idiomatic code

* i'm not gonna lie to you here, you can find pretty much all of the code used in my recursive programs anywhere on the internet.  it looks like they all have standard ways of being performed. i mean, i can explain to you line by line what is going on, and i believe i understand the rudiments of recursion. parameters go in, function calls itself over and over until some internal condition is met, ?????, profit. I SWEAR IT'S IDIOMATIC NOT PLAGIARISM.

##### on static classes

* every class here is static and final. there's pretty much no need to instantiate them before using their methods, nor is there any need for extension, hence, static and final.

##### SymbolBalancer.java

* in the case of a closing symbol calling a pop over an empty stack, `SymbolBalancer` will throw a `NoSuchElementException`.  to handle this case, a try-catch block has been implemented that immediately returns false if ever a closing symbol tries to pop an empty stack.

##### FibonacciRecursor.java

* the recursions are along the fibonacci sequence are 0 indexed.  e.g., if you pass in 3 as a parameter, you will receive the fourth fibonacci number, 2.