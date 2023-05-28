package sampleprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class WordleSample {
    public static void main(String[] args) {

        WordleSample obj = new WordleSample();

        obj.item('b', 0);

    }

    void item (int ch, int idx)  {
         Set<Character> Zero = new HashSet<>();
        Set<Character> First = new HashSet<>();
        Set<Character> Second = new HashSet<>();
        Set<Character> Third = new HashSet<>();
        
        String[] words = {"ball", "band","bend","tend", "bond", "went", "joke"};
   


        Stream<String> list = Arrays.stream(words);


        for(int i = 0; i < words.length; i++){
           if(words[i].charAt(idx) == ch) {
            
          Stream<String> arrList = list.filter(x->x.charAt(idx) == ch);

          String[] arr = arrList.toArray(String[]::new);

          for(int j = 0; j<arr.length ; j++){
            Zero.add(arr[j].charAt(0));
            First.add(arr[j].charAt(1));
            Second.add(arr[j].charAt(2));
            Third.add(arr[j].charAt(3));
          }
          System.out.println("0: " +Zero);
          System.out.println("1: "+ First);
          System.out.println("2: "+ Second);
          System.out.println("3: "+ Third);

           }
           
        }

    }
   
        // Set<String> Zero = new HashSet<String>();
        // Set<String> First = new HashSet<String>();
        // Set<String> Second = new HashSet<String>();
        // Set<String> Third = new HashSet<String>();

    
            // System.out.println(item[1].charAt(0));

    //         for(int i = 0; i < item.length; i++){
    //         if(item[i].charAt(0) == 'b') {

    //             First.add("a");
    //             First.add("e");
    //             First.add("o");

    //             Second.add("l");
    //             Second.add("n");
               
    //             Third.add("l");
    //             Third.add("d");
            
    //         }

    //         if(item[i].charAt(0) == 't') {
    //             First.add("e");
    //             Second.add("n");
    //             Third.add("d");
    //         }

    //         if(item[i].charAt(0) == 'w') {
    //             First.add("e");
    //             Second.add("n");
    //             Third.add("t");
    //         }

    //         if(item[i].charAt(0) == 'j') {
    //             First.add("o");
    //             Second.add("k");
    //             Third.add("e");
    //         }

    //         if(item[i].charAt(1) == 'a'){
    //             Zero.add("b");
                
    //             Second.add("l");
    //             Second.add("n");
                
    //             Third.add("l");
    //             Third.add("d");
        
    //         }

    //         if(item[i].charAt(1) == 'e'){
    //             Zero.add("b");
    //             Zero.add("t");
    //             Zero.add("w");

    //             Second.add("n");

    //             Third.add("t");
    //             Third.add("d");
    //         }

    //         if(item[i].charAt(1) == 'o') {
    //             Zero.add("b");
    //             Zero.add("j");

    //             Second.add("n");
    //             Second.add("k");

    //             Third.add("d");
    //             Third.add("e");
    //         }
    //         if(item[i].charAt(2) == 'l') {
    //             Zero.add("b");

    //             First.add("a");

    //             Third.add("l");
    //         }

    //         if(item[i].charAt(2) == 'n') {
    //             Zero.add("b");
    //             Zero.add("t");
    //             Zero.add("w");

    //             First.add("a");
    //             First.add("e");

    //             Third.add("d");
    //             Third.add("t");
    //         }
    //         if(item[i].charAt(2) == 'k') {
    //             Zero.add("j");
    //             First.add("o");
    //             Third.add("e");
    //         }

    //         if(item[i].charAt(3) == 'l') {
    //             Zero.add("b");
    //             First.add("a");
    //             Second.add("l");

    //         }
    //         if(item[i].charAt(3) == 'd') {
    //             Zero.add("b");
    //             Zero.add("t");

    //             First.add("a");
    //             First.add("e");
    //             First.add("o");

    //             Second.add("n");
    //         }

    //         if(item[i].charAt(3) == 't') {
    //             First.add("w");
    //             Second.add("e");
    //             Third.add("n");
    //         }

    //         if(item[i].charAt(3) == 'e') {
    //             Zero.add("j");
    //             First.add("o");
    //             Second.add("k");
    //         }
            

    //     }

    //     System.out.println("0: " + Zero);
    //     System.out.println("1: " + First);
    //     System.out.println("2: " + Second);
    //     System.out.println("3: " + Third);
        
    }

