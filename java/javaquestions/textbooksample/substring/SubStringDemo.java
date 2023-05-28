package textbooksample.substring;

public class SubStringDemo {

    String s1;
    String s2;
    char ch;

    SubStringDemo(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int firstOccurence() {
        for (int i = 0; i < s1.length(); i++) {
            if (getCh() == s1.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public int findIndex() {
        int index = -1;
        for (int i = 0; i < s1.length(); i++) {
            String s3 = "";

            for (int j = i; j < i + s2.length(); j++) {
                s3 += s1.charAt(j);
            }

            if (s3.equals(s2)) {
                index = i;
                break;
            }
        }

        return index;
    }

}
