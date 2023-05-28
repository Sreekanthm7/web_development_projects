package SchoolProject;

import java.util.ArrayList;

public class exams {
    
    int language;
    int drawing;
    int craft;

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

}
