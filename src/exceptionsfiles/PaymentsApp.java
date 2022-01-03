package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {
    //Take a payment from a user
    public static void main(String[] args) {
        double payment = 0;
        boolean positivePymt = true;

        //1. Ask the user for input
        System.out.print("Enter the payment amount: ");
        do {
            //2. get the amount and test value
            Scanner in = new Scanner(System.in);

            //3. Handle exceptions appropriately
            try {
                payment = in.nextDouble();
                if (payment < 0) {
                    throw new NegativePaymentException(payment);
                    //throw error
                } else {
                    positivePymt = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                System.out.println("Please try again");
                positivePymt = false;
            }//exception
        } while (!positivePymt);


        //4. Print confirmation
        System.out.println("Thank you for your payment of $" + payment);
    }
}
