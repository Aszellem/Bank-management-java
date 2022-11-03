package src.main.model.account;

public class Loan extends Account{

    private static final double INTEREST_RATE = 0.02;
    private static final double MAX_DEBT = 10000;

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
        if(super.getBalance() + amount > MAX_DEBT){
            return false;
        }
        super.setBalance(super.round(super.getBalance() + amount + (amount * INTEREST_RATE)));
        return true;
    }
    


}
