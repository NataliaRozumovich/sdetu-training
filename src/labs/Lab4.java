package labs;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {
    public static void main(String[] args) {
        List<String[]> cardData = new ArrayList<String[]>();
        String fileName = "d:\\Nata\\QAA_files\\Files\\CreditCard.csv";
        String dataRow;
        double balance = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while ((dataRow = br.readLine()) != null) {
                String[] line = dataRow.split(",");
                cardData.add(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("| Date | Type  | Company | Amount | ");
        for (String[] data : cardData) {
            System.out.print("| ");
            for (String field : data) {
                System.out.print(field + "| ");
            }
            System.out.println("");
        }
        double amount[] = new double[cardData.size()];
        for (int i = 0; i < amount.length; i++) {
            if (cardData.get(i)[1].equals("CREDIT") || cardData.get(i)[1].equals("FEE")) {
                balance = balance + Double.parseDouble(cardData.get(i)[3]);
            }
            if (cardData.get(i)[1].equals("DEBIT")) {
                balance = balance - Double.parseDouble(cardData.get(i)[3]);
            }


        }
        if (balance > 0) {
            System.out.println("Your balance is: $" + balance);
            System.out.println("The final balance is greater than zero! 10% fee is charged: $" + balance * 0.1);
            System.out.println("Your new balance is: $" + balance * 1.1);
        }
        if (balance < 0) {
            System.out.println("Your balance is: $" + balance);
            System.out.println("Thank you for your payment!");
            System.out.println("Your overpayment is: $" + balance);
        }
        if (balance == 0) {

            System.out.println("Your balance is: $" + balance);
            System.out.println("Thank you for your payment!");
        }


    }
}
