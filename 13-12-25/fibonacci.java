import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid argument. Provide a positive integer.");
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of terms: ");
            if (!sc.hasNextInt()) {
                System.err.println("Please enter a valid positive integer.");
                sc.close();
                return;
            }
            n = sc.nextInt();
            sc.close();
        }

        if (n <= 0) {
            System.out.println("No terms to display.");
            return;
        }

        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i < n) System.out.print(" ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}