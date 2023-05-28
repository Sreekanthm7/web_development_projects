package javatask;

import java.util.ArrayList;

public class Bank {

    ArrayList<BankAccount> data = new ArrayList<>();

    public void addAccount(BankAccount account) {
        data.add(account);

    }

    public void removeAccount(BankAccount account) {
        data.remove(account);
    }

    int totalBalance = 0;

    public double getTotalBalance() {
        for (BankAccount balance : data) {
            totalBalance += balance.getBalance();

        }
        return totalBalance;

    }

    public double getAverageBalance() {

        int averageBalance = totalBalance / data.size();

        return averageBalance;

    }

    public double getpayDividents(double amount) {
        double payDivident = amount / totalBalance;

        for (BankAccount balance : data) {
            double payDividentAmount = balance.getBalance() * payDivident;

        }
        return payDivident;

    }

    public void isage() {

        for (BankAccount owner : data) {

            if (owner.getOwner().getAge() < 19) {
                System.out.println(owner);
            }

        }
    }

    double totalBalancePerson = 0;

    public double getTotalBalancePerson(Person Person) {
        for (BankAccount account : data) {

            if (account.getOwner() == Person) {
                totalBalancePerson += account.getBalance();
            }

        }
        return totalBalancePerson;

    }


public double getAverageBalancePerson(Person Person){

ArrayList<Person> Sameowner = new ArrayList<>();
    double averageBalancePerson = 0;
    for(BankAccount account: data){
        if(account.getOwner() == Person){
          Sameowner.add(Person);

        int sizeOfSameowner = Sameowner.size();

        averageBalancePerson = totalBalancePerson / sizeOfSameowner;
           
        }
    }
    return averageBalancePerson;

}

}