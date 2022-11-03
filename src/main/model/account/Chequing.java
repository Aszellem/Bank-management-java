package src.main.model.account;

public class Chequing extends Account{

    public Chequing(Account source) {
        super(source);
    }

    public Chequing(String id, String name, double balance) {
        super(id, name, balance);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean withdraw(double amount) {
        // TODO Auto-generated method stub
        return false;
    } 


}
