package src.main.model.account;

public class Savings extends Account{

    private static final double WITHDRAWAL_FEE = 5.00;

    public Savings(Account source) {
        super(source);
    }

    public Savings(String id, String name, double balance) {
        super(id, name, balance);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.round(super.getBalance() + amount));
        
    }

    @Override
    public boolean withdraw(double amount) {
        super.setBalance(super.round(super.getBalance() - amount - WITHDRAWAL_FEE));
        return true;
    }

    



}
