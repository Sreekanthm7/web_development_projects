package javatask;

public class BankAccount {
    private static String accountNumber;
    private double balance;
    Person owner;
    private double interestRate;
    private double minBalance = 1000;
    private double addInterest;

    BankAccount(String AccountNumber, Person owner, double balance) {
        this.accountNumber = AccountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", owner=" + owner
                + "]";
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(String newaccountNumber) {
        this.accountNumber = newaccountNumber;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double newbalance) {
        this.balance = newbalance;
    }

    public Person getownerName() {
        return owner;
    }

    public void setownerName(Person newownerName) {
        this.owner = newownerName;
    }

    public double getinterestRate() {
        return interestRate;
    }

    public void setinterestRate(double newinterestRate) {
        this.interestRate = newinterestRate;
    }

    public double deposit(double amount) {

        if(amount > 0){
         balance = balance + amount;


    }
        return balance;


        
    }

    public boolean withdraw(double amount) {

        if (balance < amount || balance - amount <= minBalance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double addInterest(int time) {
        addInterest = ((balance * interestRate * time) / 100);
        return addInterest;
    }

    public boolean transfer(int amount, BankAccount accountNumber) {

        if (balance < amount || (balance - amount) < minBalance) {

            return false;
        
        }else {
            balance = balance - amount;
            accountNumber.balance += amount;
        }
        
        return true;        

    }
}

