public class Task {
    public static void main(String[] args) {
        // Even or Odd
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // Sum of N natural numbers
        int n1 = 10;
        long sum = (long) n1 * (n1 + 1) / 2;
        System.out.println("Sum of first " + n1 + " natural numbers is " + sum);
        
        // Voting eligibility
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // Positive, Negative, or Zero
        int value = -5;
        if (value > 0) {
            System.out.println(value + " is positive");
        } else if (value < 0) {
            System.out.println(value + " is negative");
        } else {
            System.out.println(value + " is zero");
        }

        // Greatest of two numbers
        int x = 25, y = 40;
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (y > x) {
            System.out.println(y + " is greater than " + x);
        } else {
            System.out.println(x + " and " + y + " are equal");
        }

        // Greatest of three numbers
        int p = 12, q = 12, r = 9;
        int greatest = p;
        if (q > greatest) greatest = q;
        if (r > greatest) greatest = r;
        System.out.println("Greatest of " + p + ", " + q + " and " + r + " is " + greatest);

        int a = 15, b = 20, c = 10;
        if (a > b && a > c) {
            System.out.println(a + " is the largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }

        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
         // Simple calculator (demonstration with fixed operands)
         double num1 = 12.5;
         double num2 = 3.0;
         char[] ops = {'+', '-', '*', '/', '%'};
         for (char op : ops) {
            double result;
            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = (num2 != 0) ? num1 / num2 : Double.NaN; break;
                case '%': result = (num2 != 0) ? num1 % num2 : Double.NaN; break;
                default: result = Double.NaN;
            }
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);
         }
         
        // Sum of N natural numbers with user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                sum = (long) n * (n + 1) / 2;
                System.out.println("Sum of first " + n + " natural numbers is " + sum);
            } else {
                System.out.println("n must be a positive integer");
            }
        }
        scanner.close();
    }
}