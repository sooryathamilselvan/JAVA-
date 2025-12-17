public class puzzle {
    public static void main(String[] args) {

        char[][] matrix = {
            {'a','l','u','l','k'},
            {'b','i','m','i','t'},
            {'j','b','j','m','p'},
            {'i','a','r','e','l'},
            {'m','u','k','o','t'}
        };

        String find = "lime";
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == find.charAt(0)) {

                    if (j + find.length() <= cols) {
                        boolean ok = true;
                        for (int k = 0; k < find.length(); k++)
                            if (matrix[i][j + k] != find.charAt(k)) ok = false;

                        if (ok)
                            System.out.println("Found \"" + find + "\" horizontally at (" + i + "," + j + ")");
                    }

                    if (i + find.length() <= rows) {
                        boolean ok = true;
                        for (int k = 0; k < find.length(); k++)
                            if (matrix[i + k][j] != find.charAt(k)) ok = false;

                        if (ok)
                            System.out.println("Found \"" + find + "\" vertically at (" + i + "," + j + ")");
                    }

                    if (i + find.length() <= rows && j + find.length() <= cols) {
                        boolean ok = true;
                        for (int k = 0; k < find.length(); k++)
                            if (matrix[i + k][j + k] != find.charAt(k)) ok = false;

                        if (ok)
                            System.out.println("Found \"" + find + "\" diagonally (↘) at (" + i + "," + j + ")");
                    }

                    if (i + find.length() <= rows && j - (find.length() - 1) >= 0) {
                        boolean ok = true;
                        for (int k = 0; k < find.length(); k++)
                            if (matrix[i + k][j - k] != find.charAt(k)) ok = false;

                        if (ok)
                            System.out.println("Found \"" + find + "\" diagonally (↙) at (" + i + "," + j + ")");
                    }
                }
            }
        }
    }
}