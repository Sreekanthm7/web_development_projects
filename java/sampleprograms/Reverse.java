package sampleprograms;

public class Reverse {
    public static void main(String[] args) {
        int n = 3458, res = 0, rev = 0;

        while(n != 0){
            res = n % 10;
            rev = rev * 10 + res;
            n = n/10;

            
        }
        System.out.println(rev);
    }
}
