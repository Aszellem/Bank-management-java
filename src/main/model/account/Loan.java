package src.main.model.account;

public class Loan extends Account{

    public Loan(Account source) {
        super(source);
    }

    public Loan(String id, String name, double balance) {
        super(id, name, balance);
        //TODO Auto-generated constructor stub
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
