package Behavioral.Visitor.Solution;

import java.util.List;

import Behavioral.Visitor.Bank;
import Behavioral.Visitor.Client;
import Behavioral.Visitor.Company;
import Behavioral.Visitor.Resident;
import Behavioral.Visitor.Restaurant;

public class InsuranceMessagingVisitor implements Visitor{
    public void sendInsuranceMails(List<Client> clients){
        for(Client client : clients){
            //visit(client); instead we'll use:
            client.accept(this);
        }
    }
    public void visit(Bank bank){
        System.out.println("Sending email to this client object");
    }
    public void visit(Company company){
        System.out.println("Sending email to this client object");
    }
    public void visit(Resident resident){
        System.out.println("Sending email to this client object");
    }
    public void visit(Restaurant restaurant){
        System.out.println("Sending email to this client object");
    }
}
