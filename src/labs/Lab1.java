package labs;

public class Lab1 {
    public static void main(String[] args) {
        // if num = 1 -> sum =  1;
        // if num = 2 -> sum = num(1) + num(2) = 1 + 2 = 2;
        // if num = 3 -> sum = num(1) + num(2) + num(3) = 1 + 2 + 3 = 6;
        // if num = 4 -> sum = num(1) + num(2) + num(3) + num(4) = 1 + 2 + 3 + 4= 10;
        //....
        //if num = n -> sum = num(1) + num(2) + num(3) + num(4) + .... + num(n) = sum(num(n-1)) + num(n)
        int n = 4;
        int arr[] = {3, 1, 9, -7};
        System.out.println(sum(n));

        System.out.println("************");

        System.out.println(fact(n));
        System.out.println("************");
        System.out.println(findMinValue(arr));
        System.out.println("************");
        System.out.println(findMaxValue(arr));
        System.out.println("************");
        System.out.println(findAVGValue(arr));


    }

    //Write a function that takes a value n returns the sum of numbers 1 to n
    public static int sum(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + i;
        }
        return s;
    }


    //Write a function that computes the factorial value
    //Definition: n! = n*(n-1)! , where 0! = 1
    //1! = 1
    //2! = 2 * 1! = 2 * 1
    //3! = 3 * 2! = 3 * (2 * 1!) = 3 * 2 * 1
    //4! = 4 * 3! = 4 * (3 * 2!) = 4 * 3 * (2 * 1!) = 4 * 3 * 2 * 1
    //Hint: use the recursive method that was used to calculate Fibonacci number
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }

        return (n * (fact(n - 1)));
    }

    // Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
    //  Hint: this should be static functions with a return type of the same data type as the array declaration.

    public static int findMinValue(int[] arr) {
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int findMaxValue(int[] arr) {
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int findAVGValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

}
