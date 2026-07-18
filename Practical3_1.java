package practical3;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class InvalidDepositException extends Exception {
    public InvalidDepositException(String message) {
        super(message);
    }
}
        
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }
            
    public void deposit(double amount) throws InvalidDepositException {
        if (amount <= 0) {
            throw new InvalidDepositException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }
            
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
    }
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}
public class Practical3_1 {
    public static void main(String[] args) {
        System.out.println("Shreyash S091");
        BankAccount account = new BankAccount(-370);
        try {
            account.displayBalance();
            account.deposit(2000);
            account.withdraw(8000); 
        } catch (InvalidDepositException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }
        try {
            account.deposit(-500); 
        } catch (InvalidDepositException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        }
        account.displayBalance();
    }
}
            
           
    
    
