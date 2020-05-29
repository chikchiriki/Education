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

        Сomparison4(a,b,c,d);
    }
        public static int Comparison2(int a, int b) {
            int answer = Math.min(a, b);
            return answer;
        }
        public static int Comparison3(int a, int b,int c) {
            int answer = Comparison2(a,b);
            int answer2 = Math.min(answer, c);
            return answer2;
        }
        public static void Сomparison4(int a, int b, int c, int d) {
            int answer2 = Comparison3(a, b, c);
            int answer3 = Math.min(answer2, d);
            System.out.println("The smallest number:"+ answer3);
        }
    }

