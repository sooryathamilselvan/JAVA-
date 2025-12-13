import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int n) {
        if (n < 0) return false; // treat negative numbers as non-palindromes
        int original = n;
        long reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed == original;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (args.length > 0) {
                // check each command-line argument
                for (String a : args) {
                    try {
                        int v = Integer.parseInt(a);
                        System.out.println(a + " -> " + (isPalindrome(v) ? "palindrome" : "not palindrome"));
                    } catch (NumberFormatException e) {
                        System.out.println(a + " -> not an integer");
                    }
                }
            } else {
                System.out.println("Enter integers (non-integer to quit):");
                while (sc.hasNextInt()) {
                    int v = sc.nextInt();
                    System.out.println(v + " -> " + (isPalindrome(v) ? "palindrome" : "not palindrome"));
                }
            }
        }
    }
}