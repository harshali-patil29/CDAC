// Base class: BankAccount
class BankAccount {
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public String getAccountDetails() {
        return "Account Holder: " + accountHolderName + "\nBalance: $" + balance;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public SavingsAccount(String accountHolderName, double balance, double withdrawalLimit) {
        super(accountHolderName, balance); 
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed! Amount exceeds the limit of $" + withdrawalLimit);
        } else {
            super.withdraw(amount); 
        }
    }

    @Override
    public String getAccountDetails() {
        return super.getAccountDetails() + "\nWithdrawal Limit: $" + withdrawalLimit;
    }
}


public class Program1 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Harshali", 10000);
        System.out.println(bankAccount.getAccountDetails());
        bankAccount.deposit(2000);
        bankAccount.withdraw(1500);

        SavingsAccount savingsAccount = new SavingsAccount("Harsh", 22000, 500);
        System.out.println(savingsAccount.getAccountDetails());

        
        savingsAccount.deposit(3000);
        savingsAccount.withdraw(300);
        savingsAccount.withdraw(1000);
    }
}
