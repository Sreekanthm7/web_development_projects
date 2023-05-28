package substring;

public class Main {
    public static void main(String[] args) {
        StringIndex sDemo = new StringIndex("hello");

        System.out.println("first occurence: "+sDemo.firstOccurence('o'));
        
        System.out.println("index of sub string s2: "+ sDemo.subStringIdx("lo"));

    }
}
