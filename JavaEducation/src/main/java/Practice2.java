import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

        public static void main(String args[]) {

            int  size, array[];

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter array length: ");
            size = scan.nextInt();

            array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = 0 + (int)(Math.random() * 10000000);

            }
            System.out.print ("Array elements:");
            for (int i = 0; i < size; i++) {
                System.out.print (" " + array[i]);
            }

            System.out.println();
            int number; //число для поиска
            do {
                System.out.println("Please enter a positive number!");
                while (!scan.hasNextInt()) {
                    System.out.println("That not a number!");
                    scan.next();
                }
                number = scan.nextInt();
            } while (number <= 0);
            System.out.println("Thank you! Your number: " + number);

            int first = 0;
            int last = size - 1;
            if (binarySearch(array, first,last, number)== -1){
                System.out.println("binarySearch = False");

            }
            else {
                System.out.println("binarySearch = True");
            }
            //binarySearch(array, first,last, number);
            linearSearch(array, size, number);
        }

        //линейный поиск
        public static void linearSearch(int[] array,int size, int number) {
            long start = System.nanoTime();
            int index;
            for (index = 0; index < size; index++){
                if (array[index] == number) {
                    System.out.println("linearSearch = True find "+ number + " in position " + (index + 1));
                    break;
                }
            }
            if (index == size) {
                System.out.println("linearSearch = False");
            }
            long finish = System.nanoTime();
            long timeConsumedMillis = finish - start;
            System.out.println("Time of work linear:"+ timeConsumedMillis + "ns");
        }


        // бинарный поиск
        public static int binarySearch(int[] array,int first,int last,  int number) {

            Arrays.sort(array);

            long start = System.nanoTime();

            // условие прекращения
            if (last >= first) {
                int mid = first + (last - first) / 2;
                if (array[mid] == number)
                    return mid;
                // если средний элемент больше числа
                if (array[mid] > number)
                    return binarySearch(array, first, mid - 1, number);
                // вызываем метод рекурсивно по меньшим данным
                long finish = System.nanoTime();
                long timeConsumedMillis = finish - start;
                System.out.println("Time of work:"+ timeConsumedMillis + "ns");
                
                return binarySearch(array, mid + 1, last, number);
            }
            long finish = System.nanoTime();
            long timeConsumedMillis = finish - start;
            System.out.println("Time of work:"+ timeConsumedMillis + "ns");
            return -1;
        }
}





















