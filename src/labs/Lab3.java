package labs;

import java.io.*;

public class Lab3 {
    public static void main(String[] args) {

        String filename = "d:\\Nata\\QAA_files\\Files\\Password.txt";
        File file = new File(filename);
        String[] passwords = new String[13];


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: file not found");
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file");
        }

        for (String password : passwords) {
            boolean hasNumber = false;
            boolean hasLetter = false;
            boolean hasSpecialChar = false;
            System.out.println("*******\n" + password);

            for (int n = 0; n < password.length(); n++) {

                //Condition #1. password contains a number
                if ("0123456789".contains(password.substring(n, n + 1))) {
                    hasNumber = true;

                    //Condition #2. password contains a letter
                } else if ("abcdefdgijklmnopqrstuvwyz".contains(password.substring(n, n + 1))) {
                    hasLetter = true;
                }

                //Condition #3. Special character (! @ #)
                else if (password.contains("!") || password.contains("@") || password.contains("#")) {
                    hasSpecialChar = true;
                }
            }
            try {
                if (!hasNumber) {
                    throw new DigitsException(password);
                } else if (!hasLetter) {
                    throw new LetterException(password);
                } else if (!hasSpecialChar) {
                    throw new SpecialCharacterException(password);
                } else {
                    System.out.println("Valid password");
                }
            } catch (DigitsException | LetterException | SpecialCharacterException e) {
                System.out.println(e.toString());
            }
        }
    }
}

class DigitsException extends Exception {
    String num;

    DigitsException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("DigitsException: " + num);
    }
}

class LetterException extends Exception {
    String num;

    LetterException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("LetterException: " + num);
    }
}

class SpecialCharacterException extends Exception {
    String num;

    SpecialCharacterException(String num) {
        this.num = num;
    }

    public String toString() {
        return ("SpecialCharacterException: " + num);
    }
}
