package SchoolProject;

public class newAdmission {

String Name;
int age;
boolean isSingleParent;
int grade;
int feesAmount;

newAdmission(String Name, int age, boolean isSingleParent,  int grade, int feesAmount){
    this.Name = Name;
    this.age = age;
    this.isSingleParent = isSingleParent;
    this.grade = grade;
    this.feesAmount = feesAmount;
}

@Override
public String toString() {
    return "newAdmission [Name=" + Name + ", age=" + age + ", isSingleParent=" + isSingleParent + ", grade=" + grade
            + ", feesAmount=" + feesAmount + "]";
}

public void feeDiscount() {

    System.out.println("Fees that "+ Name +" should pay: ");
    if(isSingleParent == true){
        System.out.println(feesAmount - feesAmount*0.2);
    }else{
        System.out.println(feesAmount);
    }
}



}
