package exceptionsfiles;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        //1. Define the file (path) that we want to read
        String fileName = "d:\\Nata\\QAA_files\\Files\\FileToRead.txt";
        String text = null;

        //2. Create the file in Java
        File file = new File(fileName);

        try {
            //3. Open the file
            BufferedReader br = null;
            br = new BufferedReader(new FileReader(file));

            //4. Read the file
            text = br.readLine();

            //5. Close the resources
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found: " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read the data: " + fileName);
            e.printStackTrace();
        } finally {
            System.out.println("Finished reading the file");
        }
        System.out.println(text);

    }
}
