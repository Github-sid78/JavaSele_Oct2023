package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandling {
    public static void main(String[] args) {
        String filepath = "src/main/resources/testfile/test.txt";
        try{
            File file = new File(filepath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }

        catch(Exception e){
          e.printStackTrace();
        }
        finally{
            bufferedReader.close();

        }
    }
}
