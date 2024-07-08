# Strategy: Mr D payment system

[Problem]: what if we want to add more payment options later?
[Solution]: we need to place each payment method into its own class making this class resposible for a particular payment strategy.

This design pattern: defines a family of algorithms, puts each of them in a separate class, and makes their objects interchangeable.

Now the PaymentService class has no visibility on how the payment is being conducted as it is making use of the strategy interface.

## State vs Strategy design pattern

State can be considered as an extension of strategy as both patterns are both patterns are based composition, they change the behavior of the context by delagating some work to helper objects. 

States: can be dependent as you can jump from one to another. It's about doing different things based on the state, results may vary. 
Strategies: are completely independent and unaware of each other. About having different implementations that accomplish the same thing.