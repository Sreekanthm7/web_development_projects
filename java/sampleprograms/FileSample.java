package sampleprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileSample {
    public static void main(String[] args) {
        
        try {
            String fileName = "wordlist.txt";
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            String line;
            while((line = br.readLine()) != null){
                 //process the line
                 System.out.println(line);
            }
            br.close();
        } 
        catch (Exception e) {
          e.getStackTrace();
    }
}

}