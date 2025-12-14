public class triangle {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
                if (j < cols - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}