import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Print numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // 2. Print even numbers 50 to 100
        for (int i = 50; i <= 100; i += 2) {
            System.out.println(i);
        }

        // 3. Factorial of a number
        System.out.println("Enter a number to find factorial: ");
        int number = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is : " + fact);

        // 4. Multiplication table
        System.out.println("Enter a number for table: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }

        // 5. Print odd numbers 1 to 30 using while loop
        int i = 1;
        while (i <= 30) {
            System.out.println(i);
            i += 2;
        }

        // 6. Print square numbers 1 to 10
        for (int j = 1; j <= 10; j++) {
            System.out.println(j * j);
        }

        sc.close();
    }
}