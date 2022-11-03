package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.main.model.account.Account;
import src.main.model.account.Chequing;
import src.main.model.account.Loan;
import src.main.model.account.Savings;

public class AccountTests {

    Account[] accounts;

    @Before
    public void setup() {
        accounts = new Account[] {
                new Chequing("f84c43f4-a634-4c57-a644-7602f8840870", "Michael Scott", 1524.51),
                new Savings("ce07d7b3-9038-43db-83ae-77fd9c0450c9", "Saul Goodman", 2241.60),
                new Loan("4991bf71-ae8f-4df9-81c1-9c79cff280a5", "Phoebe Buffay", 2537.31)
        };
    }

    //A chequing account allows users to deposit or withdraw an amount of money.
    @Test
    public void withdrawal(){
        accounts[0].withdraw(1440);
        assertEquals(84.51, accounts[0].getBalance());
    }

    //The chequing account charges an overdraft fee of $5.50 if the amount being withdrawn exceeds the account balance.
    @Test
    public void overdraft(){
        accounts[0].withdraw(1534.43);
        assertEquals(-15.42, accounts[0].getBalance());
    }

    //The overdraft limit is $200.00 dollars.
    @Test
    public void overdraftLimit(){
        accounts[0].withdraw(1726);
        assertEquals(1524.51, accounts[0].getBalance());
    }

    //Deposits are free, but the savings account charges a $5.00 fee for every withdrawal.
    @Test
    public void withdrawalFee(){
        accounts[1].withdraw(100);
        assertEquals(2136.60, accounts[1].getBalance());
    }

    //Every withdrawal is charged a fixed interest rate of 2%.
    @Test
    public void withdrawalInterest(){
        accounts[2].withdraw(2434.31);
        assertEquals(5020.31, accounts[2].getBalance());
    }

    //A withdrawal can't made if the debt exceeds $10,000.
    @Test
    public void withdrawalLimit(){
        accounts[2].withdraw(7463.69);
        assertEquals(2537.31, accounts[2].getBalance());
    }

    @Test
    public void deposit(){
        accounts[0].deposit(5000);
        assertEquals(6524.51, accounts[0].getBalance());
    }

    @Test
    public void loanDeposit(){
        accounts[2].deposit(1000);
        assertEquals(1537.31, accounts[2].getBalance());
    }
}
