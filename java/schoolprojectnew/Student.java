package schoolprojectnew;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Student {

    private String name;
    private int age;
    private boolean isSingleParent;
    private String parentEmail;
    private boolean feePaid;

    ArrayList<Integer> firstTerm = new ArrayList<>();
    ArrayList<Integer> secondTerm = new ArrayList<>();
    ArrayList<Integer> thirdTerm = new ArrayList<>();

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSingleParent() {
        return isSingleParent;
    }

    public void setSingleParent(boolean isSingleParent) {
        this.isSingleParent = isSingleParent;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (pat.matcher(parentEmail).matches()) {
            this.parentEmail = parentEmail;
        }
    }

    public boolean isfeePaid() {
        return feePaid;
    }

    public void setfeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }

    public boolean isEligibleForFeeDiscount() {
        boolean isEligibleForFee = false;
        if (isSingleParent() == true) {
            isEligibleForFee = true;
        }
        return isEligibleForFee;

    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", isSingleParent=" + isSingleParent + ", parentEmail="
                + parentEmail + ", feePaid=" + feePaid + ", firstTerm=" + firstTerm + ", secondTerm=" + secondTerm
                + ", thirdTerm=" + thirdTerm + "]";
    }

    public int getAverageMark(String term) {
        int sum = 0;
        int average = 0;

        if (term == "firstTerm" && firstTerm.size() > 0) {
            for (int mark : firstTerm) {
                sum += mark;
            }
            average = sum / firstTerm.size();
        }

        if (term == "secondTerm" && secondTerm.size() > 0) {
            for (int mark : secondTerm) {
                sum += mark;
            }
            average = sum / secondTerm.size();
        }

        if (term == "thirdTerm" && thirdTerm.size() > 0) {
            for (int mark : thirdTerm) {
                sum += mark;
            }
            average = sum / thirdTerm.size();
        }
        return average;

    }

    public boolean isEligibleToPass() {
        return getAverageMark("firstTerm") >= 50 && getAverageMark("secondTerm") >= 50
                && getAverageMark("thirdTerm") >= 50;
    }

    public void updateFirstTermMark(int language, int drawing, int craft) {

        firstTerm.set(0, language);
        firstTerm.set(1, drawing);
        firstTerm.set(2, craft);

    }

    public void updateSecondTermMark(int language, int drawing, int craft) {
        secondTerm.set(0, language);
        secondTerm.set(1, drawing);
        secondTerm.set(2, craft);

    }

    public void updateThirdTermMark(int language, int drawing, int craft) {
        thirdTerm.set(0, language);
        thirdTerm.set(1, drawing);
        thirdTerm.set(2, craft);
    }

}
