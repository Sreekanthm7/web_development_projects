package sampleprograms;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args)  {
        Sample obj = new Sample();
        obj.item('r', 0);
    }

    void item(char ch , int pos){
        Set<Character> Zero = new HashSet<>();
        Set<Character> First = new HashSet<>();
        Set<Character> Second = new HashSet<>();
        Set<Character> Third = new HashSet<>();

        try {
            String fileName = "wordlist.txt";
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            String line;
            while((line = br.readLine()) != null){
              String[] words = line.split(" ");
                System.out.println(Arrays.toString(words));
            
       

            Stream<String> stream = Arrays.stream(words);
            for(int i = 0 ; i< words.length; i++) {
                if(words[i].charAt(pos) == ch){
                    Stream<String> item = stream.filter(x -> x.charAt(pos) == ch);
    
                    String[] str = item.toArray(String[]::new);
    
                    for(int j = 0 ; j < str.length; j++){
    
                        Zero.add(str[j].charAt(0));
                        First.add(str[j].charAt(1));
                        Second.add(str[j].charAt(2));
                        Third.add(str[j].charAt(3));
    
                    }
    
                    System.out.println("Zero: "+ Zero);
                    System.out.println("First: "+ First);
                    System.out.println("Second: "+ Second);
                    System.out.println("Third: "+ Third);
                }
            

            }
                br.close();

        
    }
        } 
        catch (Exception e) {
          e.getStackTrace();
    }
        
    
}

}


//>> created a class item and passed an argument ch for character and pos for position
//>> created four set which contain non reapeating elements 
//>> Inside the try block generated a code to take the elements from the txt file
//>> and used split() method to split element into string
//>> and converted the array  into Stream and looping through that words
//>> and checking a condition in the if statement that charector and positon which matches or not
//>>  if it matches then we used filter method to filter those words that matches with  character and position that we inserting
//>> Again we are changing the stream into arrays of filtered words
//>> then created a for loop to loop into the characters of those words and inserted the four characters of those words into individual four sets 