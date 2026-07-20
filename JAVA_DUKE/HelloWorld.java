package JAVA_DUKE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HelloWorld {
   
    public static void main(String[] args) {
        try {
            List <String> allLines = Files.readAllLines(Paths.get("JAVA_DUKE/helloWorld.txt"));

           
            for (int i = 0; i < allLines.size(); i++) {
    // Crucial part: You must use .get(i) for a List!
    String line = allLines.get(i); 
    System.out.println(line);
}

        } catch (IOException e) {
        }
    }
}
