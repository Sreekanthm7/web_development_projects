package SchoolProject;

import java.util.ArrayList;

public class Student {

    String Name;
    int age;
    boolean isSingleParent;
    String fee;
    int grade;
    int marks;
    int feesAmount;
    Student(String Name, int age, boolean isSingleParent, String fee, int grade, int marks, int feesAmount){
        this.Name = Name;
        this.age = age;
        this.isSingleParent = isSingleParent;
        this.fee = fee;
        this.grade = grade;
        this.marks = marks;
        this.feesAmount= feesAmount;
    }

    
    @Override
    public String toString() {
        return "Student [Name=" + Name + ", age=" + age + ", isSingleParent=" + isSingleParent + ", fee=" + fee
                + ", grade=" + grade + ", marks=" + marks + ", feesAmount=" + feesAmount + ", FirstTerm=" + FirstTerm
                + ", SecondTerm=" + SecondTerm + ", ThirdTerm=" + ThirdTerm + "]";
    }



    public void feeDiscount() {

            System.out.println("Fees that "+ Name+ " should pay: ");
            if(isSingleParent == true){
                System.out.println(feesAmount - feesAmount*0.2);
            }else{
                System.out.println(feesAmount);
            }
    }

    public void studentReg(int age){
        if(age < 5) {
            System.out.println("student must be at least 5 year old to addmitted to the first grade");
        } else if(age == 5){
            System.out.println("You can admit "+Name+" to grade 1");
        }else if(age == 6) {
            System.out.println("You can admit "+Name+" to grade 2");

        }else if(age == 7) {
            System.out.println("You can admit "+Name+" to grade 3");

        }
    }
    

    ArrayList<Integer> FirstTerm = new ArrayList<>();
    ArrayList<Integer> SecondTerm = new ArrayList<>();
    ArrayList<Integer> ThirdTerm = new ArrayList<>();




    public void FirstTerm(int language, int drawing, int craft){
            FirstTerm.add(language);
            FirstTerm.add(drawing);
            FirstTerm.add(craft);
            

    }

    public void SecondTerm(int language, int drawing, int craft){
            SecondTerm.add(language);
            SecondTerm.add(drawing);
            SecondTerm.add(craft);
    }

    public void ThirdTerm(int language, int drawing, int craft){
            ThirdTerm.add(language);
            ThirdTerm.add(drawing);
            ThirdTerm.add(craft);
    }

    public int FirstTermTotal(){
        
    int FirstTermTotal = FirstTerm.get(0) + FirstTerm.get(1) + FirstTerm.get(2);
    
        System.out.println("FirstTermTotal: "+ FirstTermTotal);
        return FirstTermTotal;
   
}

public int SecondTermTotal() {
  int SecondTermTotal = SecondTerm.get(0) + SecondTerm.get(1) + SecondTerm.get(2);

  System.out.println("SecondTermTotal: "+ SecondTermTotal);
return SecondTermTotal;
  
}

public int ThirdTermTotal() {
    int ThirdTermTotal = ThirdTerm.get(0) + ThirdTerm.get(1) + ThirdTerm.get(2);

    System.out.println("ThirdTermTotal: " + ThirdTermTotal);
    return ThirdTermTotal;
}



public void isEligible(){
    if(fee== "paid" && this.FirstTermTotal() > 50 && this.SecondTermTotal() > 50 && this.SecondTermTotal() > 50){
            System.out.println(Name + " has passed to next grade");
    }else{
            System.out.println(Name+ " You are not eligible");
    }

}


}