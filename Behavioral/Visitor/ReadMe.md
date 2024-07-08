# Scenario: Visitor design pattern

As a software developer working for an insurance company, to represent the clients of the company you made a class for each one based on a category. Manager then suggests a new feature(send email to each client separately). We dont want to violate the open-closed principle. we'll use the visitor pattern which separates the algorithm from the objects on which they operate. And add this new feature into our codebase.

Since we cannot resolve the method within our Visitor class, we'll use double dispatch(delegates choosing method to the object itself instead of letting the client select the method).

Classes will focus on their main job, isolates certain behaviors from the objects on which they operate, and place them in a single class.