package sampleprograms;

public class EvenSum {
    
    public static void main(String[] args) {
        int n = 10, sum = 0;

        for(int i = 1; i <= 10; i++) {
           if(i % 2 == 0){
            System.out.println(i);

            sum = sum + i;

           
           }
           
        }
        System.out.println(sum);

    }
}
