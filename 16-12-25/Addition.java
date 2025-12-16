import java.util.Scanner;
class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();   // rows
        int c = sc.nextInt();   // columns
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];
        // Read first matrix
        for(int i = 0; i < r; i++) {
            for(int j = 
            0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        // Read second matrix
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // Add matrices
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        // Print result
        System.out.println("Sum of matrices:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}