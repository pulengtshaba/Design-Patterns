# Chain of responsibility example

Request->handler->handler->handler->Right handler
This pattern transforms a certain behavior into stand alone object called handlers. For example, User authentication steps.

Used when we encounter the need to execute several handlers in a particular order. each handler must either process the request or pass it along the chain. You can also insert, remove, or reorder handlers dynamically.

https://github.com/geekific-official/geekific-youtube/