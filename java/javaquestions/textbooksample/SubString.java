package textbooksample;

public class SubString {

    public int subStringData(String s1, String s2) {
        int i;
        for (i = 0; i < s1.length(); i++) {
            if (s1.charAt(0) == s2.charAt(i)) {
                System.out.println(i);
                break;
            }
        }
        return i;

    }


    public static void main(String[] args) {
    
        SubString sub = new SubString();
        sub.subStringData("abcdcg", "cg");

    }

}