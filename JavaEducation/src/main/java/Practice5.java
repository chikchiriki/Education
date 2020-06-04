import java.util.Scanner;

public class Practice5 {

         static void hanoi(int n, char from, char to, char helper)
        {
            if (n == 0) return;

            hanoi(n-1,from,helper,to);

            System.out.println(n + " Moved from "+ from + " To " + to);

            hanoi(n-1,helper,to,from);
        }

        public static void main(String args[])

        {
            Scanner con = new Scanner(System.in);
            System.out.println("Enter number of disks: ");
            int n = con.nextInt();

            hanoi(n,'A','C','B');
        }

}
