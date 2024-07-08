package AbstractFactory.AF;
// abstract factory class
/*
 * use Abstract factory when your code needs to work with 
 * other families of related products
 */
public abstract class Company {
    
    // some other business logic

    public abstract Component createComponent(String typeOfComponent);
}
