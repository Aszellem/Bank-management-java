package src.main.model.account;

public class Loan extends Account{

    private static final double INTEREST_RATE = 0.02;

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
        super.setBalance(super.round(super.getBalance() + amount + (amount * INTEREST_RATE)));
        return true;
    }
    


}
