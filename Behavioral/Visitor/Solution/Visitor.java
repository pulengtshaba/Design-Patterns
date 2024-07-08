package Behavioral.Visitor.Solution;

import Behavioral.Visitor.Bank;
import Behavioral.Visitor.Company;
import Behavioral.Visitor.Resident;
import Behavioral.Visitor.Restaurant;

public interface Visitor {
    void visit(Bank bank);
    void visit(Company company);
    void visit(Resident resident);
    void visit(Restaurant restaurant);
}
