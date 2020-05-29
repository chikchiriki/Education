import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String args[]) {

        int size, array[], first, last;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        size = scan.nextInt();

        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * 7) + 3);

        }
        System.out.print("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        bubbleSort(array);
        insertionSort(array);

    }

    public static void bubbleSort(int[] array){

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("BubbleSort" + Arrays.toString(array));
    }
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j]> key) {
                array[j + 1]= array[j];
                j = j - 1;
            }
            array[j + 1]= key;
        }
        System.out.println("InsertionSort" + Arrays.toString(array));
    }

}





