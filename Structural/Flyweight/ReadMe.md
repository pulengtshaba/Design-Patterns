# Amazon book example:

Since we're working with millions of object, we had insufficient memory(problem). [Solution]: let's us fit more objects into the available RAM by sharing common parts of state between multiple objects instead of storing all of the data in each object individually. Stop storing the state that rarely changes inside the object,instead move it into a separate object.

flyweight(BookType) is immutable, it stores the intrinsic state of the object which is invariant, context-independent, sharable and never altered at runtime. (Book) now has the extrinsic states which is the part that's unique, and may be altered at runtime.

flyweight factory returns the flyweight possibilities

this pattern is an opyimization and should be applied when a program has a ram consumption problem related to having a massive number of similar objects in memory at the same time. 