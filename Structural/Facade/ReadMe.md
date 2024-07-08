# Facade example

Banking/e-wallet application: Buy, sell, & store crypto.
what if the written code was required at multiple areas within the current codebase(duplication)? We'll need a centralized place to put all our logic and restrict direct access to the inner workings of the library.[Solution]: is a Facade which provides a simplified interface to a library,framework, or any other complexset of classes. for example, buy,sell, and store functions are our duplicated functionalities.

BuyCurrencyFacade- proides access to a certain part of subsystem's functionality, avoid growing a facade too big(god object)