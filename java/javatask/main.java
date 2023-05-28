package javatask;

import java.lang.reflect.Executable;

import SchoolProject.exams;

public class main {



    public static void testAge(){
        int given;
        int expected; 
        int got;

        Person rohit = new Person("Rohit", 0, "Male");

        //test case 1

        given = 0; expected = 0;
        rohit.setAge(given);
        got = rohit.getAge();  
        
        assert(got == expected):"setAge: Test case 1 failed, given:"+given+" exp: "+expected+" but got:"+got;
   
   
        
    //test case 2

    given = expected = 15;
    rohit.setAge(given);
    got = rohit.getAge();

    assert(got == expected): "setAge: Test case 2 failed. given:"+given+"exp:"+expected+"but got:"+got;

    //test case 3

    given = 10; expected = 15;
    rohit.setAge(given);
    got = rohit.getAge();

    assert(got == expected): "setAge: Test case 3 failed. given:"+given+"exp:"+expected+"but got:"+got;


    }
    


    public static void testGender(){

        String given;
        String expected;
        String got;

        Person rohit = new Person("Rohit", 10, "Male");


        //test case 1

        given = expected = "Male";
        rohit.setGender(given);
        got= rohit.getGender();

        assert(got == expected): "setGender: Test case 1 failed. given: "+given+" exp:"+expected+"but got:"+got;

        //test case 2

        given = "Trans";
        rohit.setGender(given);
        got = rohit.getGender();

        assert(got == expected): "setGender: Test case 2 failed. given: "+given+" exp:"+expected+"but got:"+got;

    }

    public static void testEmail(){
        String given;
        String expected;
        String got;

        Person rohit = new Person("rohit", 16, "Male");

        //test case 1

        given = "rohit123@gmail.com";
        expected = "rohit123@gmail.com";
        rohit.setEmail(given);
        got = rohit.getEmail();
        assert(got == expected): "setEmail: Test case 1 failed.  given: "+given+" exp:"+expected+"but got:"+got;


        //test case 2

        given = "rohit@rwerwr.gmail.com";
        rohit.setEmail(given);
        got = rohit.getEmail();

        assert(got == expected): "setEmail: Test case 2 failed.  given: "+given+" exp:"+expected+"but got:"+got;

    }


    public static void testIsAdult(){
        boolean given;
        boolean expected;
        boolean got;

        Person rohit = new Person("Rohit", 20, "Male");

        //test case 1

        given = true;
        expected = true;
        got = rohit.isAdult();

        assert(got == expected): "isAdult:  Test case 1 failed.  given: "+given+" exp:"+expected+"but got:"+got;
        

        //test case 2

        expected = true;
        rohit.setAge(13);
        got = rohit.isAdult();

        assert(got == expected): "isAdult:  Test case 2 failed.  given: "+given+" exp:"+expected+"but got:"+got;


    }


    public static void testFriend(){
        String given;
        boolean expected;
        boolean got;


        Person rohit = new Person("Rohit", 23, "Male");
        Person Mia = new Person("Mia", 22, "Female");

        rohit.addFriend(Mia);

        // test case 1

        expected = true;
        given = "Mia";
        got = rohit.hasFriend(given);

        
        assert (got == expected): "hasFriend:  Test case 1 failed.  given: "+given+" exp:"+expected+"but got:"+got;
    
    
        // test case 2

        expected = false;
        given = "Nivya";
        got = rohit.hasFriend(given);
        
        assert (got == expected): "hasFriend:  Test case 2 failed.  given: "+given+" exp:"+expected+"but got:"+got;

    }

    public static void testJobTitle(){
        String given;
        boolean expected;
        boolean got;

        Person rohit = new Person("Rohit", 23, "Male");

        rohit.setJobTitle("Doctor");

        // test case 1

        expected = true;
        given = "Doctor";
        got = rohit.setJobTitle(given);

        assert (got == expected): "hasJobTitle: Test case 1 failed.  given: "+given+" exp:"+expected+"but got:"+got;

    }



    public static void testDeposit(){
         double given;
         double expected;
         double got;


        Person rohit = new Person("Rohit", 15, "Male");

         BankAccount acc1 = new BankAccount("1234", rohit, 10000);

         acc1.deposit(500);

        // test case 1
        given = 0;
        expected = 10500;
        got = acc1.deposit(given);

        assert (got == expected): "deposit: Test case 1 failed.  given: "+given+" exp:"+expected+"but got:"+got;

        //test case 2

        given = -1000;

        got = acc1.deposit(given);

        assert (got == expected): "deposit: Test case 2 failed.  given: "+given+" exp:"+expected+"but got:"+got;

    }


    public static void main(String[] args) {
        

    //     Person Rahul = new Person("Rahul", 18, "Male");
    //     System.out.println(Rahul.name);

    //     // assert Rahul.getAge() == 18;
    //     System.out.println(Rahul.age);
    //     System.out.println(Rahul.gender);
    //     Rahul.setEmail("Rahul123@gmail.com");
    //     System.out.println(Rahul.getEmail());
    //     // assert Rahul.JobTitle == "Doctor";
    //     Rahul.setJobTitle("Doctor");
    //     System.out.println(Rahul.JobTitle);
    //     // assert Rahul.getAddress() == "Jayanagar Street1";
    //     Rahul.setAddress("Jayanagar Street1");
    //     System.out.println(Rahul.Address);
    //     Rahul.greet();
    //     Rahul.isAdult();

    //     Person Akshay = new Person("Akshay", 19, "Male");
    //     System.out.println(Akshay.age);
    //     Person Amal = new Person("Amal", 16, "Male");
    //     Rahul.addFriend(Akshay);
    //     Rahul.addFriend(Amal);

    //     System.out.println("Friends: " + Rahul.Pfriends);

    //     Rahul.removeFriend(Akshay);
    //     System.out.println("Friends: " + Rahul.Pfriends);

    //     Rahul.hasFriend("Akshay");

    //     Amal.setJobTitle("Pilot");
    //     System.out.println(Amal.JobTitle);

    //     Rahul.introduce();
    //     Amal.introduce();

    //     Amal.setAddress("Jayanagar Street2 ");
    //     System.out.println(Amal.Address);

    //     Rahul.printFriends();

    //     BankAccount acc1 = new BankAccount("12345", Rahul, 10000);
    //     acc1.deposit(1000);
    //     System.out.println(acc1.withdraw(9600));

    //     BankAccount acc2 = new BankAccount("432525", Amal, 50000);
    //     // System.out.println(acc2.withdraw(1000));
    //     System.out.println(acc1.getAccountNumber());
    //     System.out.println("balance: " + acc1.getbalance());
    //     BankAccount acc3 = new BankAccount("5452523", Amal, 60000);
    //     BankAccount acc4 = new BankAccount("5796526", Rahul, 40000);
    //     Bank bank = new Bank();
    //     bank.addAccount(acc1);
    //     bank.addAccount(acc2);
    //     bank.addAccount(acc3);
    //     bank.addAccount(acc4);
    //     System.out.println(bank.data);
    //     // bank.removeAccount(acc2);
    //     // System.out.println(bank.data);

    //     System.out.println(bank.getTotalBalance());
    //     System.out.println(bank.getAverageBalance());

    //     acc1.setInterestRate(100);
    //     System.out.println(acc1.addInterest(2));

    //     acc2.setInterestRate(100);
    //     System.out.println(acc2.addInterest(2));

    //     System.out.println(bank.getpayDividents(1000));
    //     System.out.println(acc1.getBalance());

    //    System.out.println(acc1.transfer(1000, acc4));

    //    System.out.println(acc4.getBalance());
    //     System.out.println(acc1.getBalance());

    //     System.out.println(acc2.getBalance());

    //     bank.isage();

    //     System.out.println(bank.getTotalBalancePerson(Amal));
    //     System.out.println(bank.getAverageBalancePerson(Amal));

    // testAge();
    // System.out.println("Test passed");
    // testGender();
    // System.out.println("Test Passed");

    // testIsAdult();
    // System.out.println("Test passed");

        // testFriend();
        //     System.out.println("Test passed");

    //     testJobTitle();
    //     System.out.println("test passed");


    testDeposit();
    System.out.println("Test passed");

    }

}
