import java.util.Scanner;

public class reverseanumber {
    public static long reverseNumber(long n) {
        long sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev * sign;
    }

    public static void main(String[] args) {
        long number;
        if (args.length > 0) {
            try {
                number = Long.parseLong(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid number: " + args[0]);
                return;
            }
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            if (!sc.hasNextLong()) {
                System.err.println("No valid integer provided.");
                sc.close();
                return;
            }
            number = sc.nextLong();
            sc.close();
        }

        long reversed = reverseNumber(number);
        System.out.println("Reversed: " + reversed);
    }
}