# Amazon delivery system

2 types of objects(order): boxes and products.
The delivery system is supposed to calculate the total price of all products contained within the mother box(root of the tree, leaves are the boxes and products within the root). It has to unwrap all the boxes, to be able to calculate the total.
1st example: problem. [Solution]: we are going to create a composite box class whose sole purpose is to store multiple other boxes then let this class and other different product classes(books and videoGame classes) implement the same interface.