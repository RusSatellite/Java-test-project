
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class RandomString {

    static String generateRandomString(int n) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(n)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    static int getX() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt(); 
        sc.close();
        return x;
    }

    public static void main(String[] args) throws IOException {
        int n = 100;
        int x = getX();
        if (x < 1 || x >= 230) {
            System.out.println("Invalid input");
            return;
        }
        PrintWriter f0 = new PrintWriter(new FileWriter("output.txt"));
        for (int i = 0; i < x; i++) {
            f0.println(RandomString.generateRandomString(n));
        }
        f0.close();
    }
}
