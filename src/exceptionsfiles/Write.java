package exceptionsfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        //1. Define the file (path) that we want to write
        String fileName = "d:\\Nata\\QAA_files\\Files\\FileToWrite.txt";
        String message = "I'm writing data that will placed to a file";

        //2. Create the file in Java
        File file = new File(fileName);

        //3. Open the file
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);

            //4. Write the file
            fw.write(message);

            //5. Close the resources
            fw.close();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file: "+ fileName);
            e.printStackTrace();
        }
        finally {
            System.out.println("Closing the fileWriter");
        }

    }
}
