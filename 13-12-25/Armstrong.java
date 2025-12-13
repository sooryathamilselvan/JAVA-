public class Armstrong {
    public static void main(String[] args) {
        int max = 9999;
        for (int n = 0; n <= max; n++) {
            if (isArmstrong(n)) System.out.println(n);
        }
    }

    private static boolean isArmstrong(int n) {
        String s = Integer.toString(n);
        int k = s.length();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int d = s.charAt(i) - '0';
            sum += (int) Math.pow(d, k);
        }
        return sum == n;
    }
}
