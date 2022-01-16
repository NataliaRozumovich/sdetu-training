package algorithms;

public class Sort {
    public static void bubbleSort(int[] dateSet) {
        boolean swapped;
        System.out.print("\nOriginal array:\n");
        printArr(dateSet);
        do{
            swapped = false;
        for (int i = 0; i < dateSet.length-1; i++) {
            if (dateSet[i] > dateSet[i + 1]) {
                int temp = dateSet[i];
                dateSet[i] = dateSet[i + 1];
                dateSet[i + 1] = temp;
                System.out.print("SWAP ");
                printArr(dateSet);
                swapped = true;
            }
        }

        } while (swapped);

    }
    private static  void printArr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
