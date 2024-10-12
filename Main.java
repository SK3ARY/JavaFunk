/**

##### JavaFunk #####

This is my attempt at recreating BrainF**k in java.

Syntax:

> Increment Cell pointer
< Decrement Cell pointer
+ Increment Cell value
- Decrement Cell value
. Fetch Cell value
, Input Cell value
[ Start loop
] Stop loop

 * Loops will end once cell value is equal to 0

**/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    static String getFileContents(String path) {
        String result = "";
        
        try {
            File fileObject = new File(path);
            Scanner fileReader = new Scanner(fileObject);
            
            while(fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                result += data;
            }
            
            fileReader.close();
            return result;
            
        } catch(FileNotFoundException e) {
            System.out.println("Error: Unknown file path");
            e.printStackTrace();
            
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        JavaFunk lang = new JavaFunk(getFileContents("./index.jf"));
    }
}