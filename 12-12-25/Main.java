//first 5 natural numbers
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int j = 0; j <= 10; j=j+2) {
            System.out.println(j);
        }
        int table = 15;
        while (table <= 15) {
            int multiplier = 1;
            while (multiplier <= 10) {
                System.out.println(table + " x " + multiplier + " = " + (table * multiplier));
                multiplier++;
            }
            System.out.println();
            table++;
        }
        
    }
}
