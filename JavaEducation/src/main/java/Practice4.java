import java.io.*;
import java.util.Scanner;

public class Practice4 {
    public static void main(String args[]) throws java.io.IOException {

        System.out.println("Please enter 1 any character!");
        char symbol = (char) System.in.read();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter path:");
        String file = scan.next();
        System.out.println("Your symbol:" + symbol + " Your path:" + file);

        try {
            LineNumberReader lnr = new LineNumberReader(new BufferedReader(new FileReader(file)));
            String content;
            while (true) {
                content = lnr.readLine();

                if (content == null)
                    break;

                long java8 = content.codePoints().filter(ch -> ch == symbol).count();

                if (content.indexOf(symbol) != -1) {
                    System.out.println("Line number:" + lnr.getLineNumber() + " Count:" + java8);
                }
            }
            System.out.println("No such symbol");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}