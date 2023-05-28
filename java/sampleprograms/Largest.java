package sampleprograms;

public class Largest {
    
    public static void main(String[] args){
        double[] numArray = {23.4, -32.5, 43, 132, 64, 643, 32.34};

        double largest = numArray[0];

        for(double num: numArray){
            if(largest < num)
            largest = num;
        }
    }
}
