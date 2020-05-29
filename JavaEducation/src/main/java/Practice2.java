import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

        public static void main(String args[]) {

            int  size, array[], first, last;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter array length: ");
            size = scan.nextInt();

            array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = 0 + (int)(Math.random() * 100);

            }
            System.out.print ("Array elements:");
            for (int i = 0; i < size; i++) {
                System.out.print (" " + array[i]);
            }
            // сортируем элементы массива, так как для бинарного поиска
            Arrays.sort(array);

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

            first = 0;
            last = size - 1;

            binarySearch(array, first, last, number);

            if (linearSearch(array, number)== -1){
                System.out.println("linearSearch = False");

            }
            else {
                System.out.println("linearSearch = True");
            }

        }

        //линейный поиск
        public static int linearSearch(int[] array, int number) {
            int flag = -1;
            long start = System.nanoTime();
            for (int index = 0; index < array.length; index++) {
            if (array[index] == number)
                flag = 1;
            }
            long finish = System.nanoTime();
            long timeConsumedMillis = finish - start;
            System.out.println("Time of work Linear:"+ timeConsumedMillis + "ns");
                return flag;
        }



        // бинарный поиск
        public static void binarySearch(int[] array, int first, int last, int number) {
            int position;
            int comparisonCount = 1;    // для подсчета количества сравнений

            long start = System.nanoTime();


            // для начала найдем индекс среднего элемента массива
            position = (first + last) / 2;

            while ((array[position] != number) && (first <= last)) {
                comparisonCount++;
                if (array[position] > number) {  // если число заданного для поиска
                    last = position - 1; // уменьшаем позицию на 1.
                } else {
                    first = position + 1;    // иначе увеличиваем на 1
                }
                position = (first + last) / 2;
            }
            if (first <= last) {
                System.out.println("binarySearch = True");
                System.out.println("Binary search method found number after  " + comparisonCount +
                        " comparisons");
            } else {
                System.out.println("binarySearch = False. Binary method finished work after "
                        + comparisonCount + " comparisons");
            }
            long finish = System.nanoTime();
            long timeConsumedMillis = finish - start;
            System.out.println("Time of work:"+ timeConsumedMillis + "ns");

        }

}

