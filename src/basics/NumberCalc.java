package basics;

public class NumberCalc {


    public static void main (String[] args) {
        System.out.println("The program is starting.");
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        int product = multiplyNumbers(numA, numB);
        //System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
        System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
    }
        static void printName(){
        System.out.println ("My name is Tim");
    }
   static void addNumbers(int numA, int numB){
        //This function will add two numbers
       int sum = numA + numB;
       System.out.println("Th sum of numbers " + numA + " and " + numB + " is " + sum);

   }

  static int multiplyNumbers(int valueA, int valueB){
        int product = valueA * valueB;
       addNumbers(product+50, product);
        return product;

  }
}
