import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,d;
        do {
            System.out.println("Enter 4 POSITIVE integers");
            while (!scan.hasNextInt()) {
                System.out.println("That not a number!");
                scan.next();
            }
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            d = scan.nextInt();
        } while (a <= 0 || b<=0 || c<0 || d<0);
                System.out.println("You entered: " + a + ";" + b + ";" + c + ";" + d + ";");

        System.out.println("The smallest number:"+ Сomparison4(a,b,c,d));
    }
        public static int Comparison2(int a, int b) {
            return Math.min(a, b);
        }
        public static int Comparison3(int a, int b,int c) {
            return Math.min(Comparison2(a,b), c);
        }
        public static int Сomparison4(int a, int b, int c, int d) {
           return Math.min(Comparison3 (a,b, c), d);
        }
    }

