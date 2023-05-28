package textbooksample.substring;

public class Main {
    public static void main(String[] args) {
        SubStringDemo sDemo = new SubStringDemo("hello", "lo");
        sDemo.setCh('o');
        System.out.println("first occurence: "+sDemo.firstOccurence());
        
        System.out.println("index of sub string s2: "+sDemo.findIndex());

    }
}
