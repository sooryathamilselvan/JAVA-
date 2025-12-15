public class Maximumofanumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
        int max = arr[0];
        
        for (int num : arr) {
            max = Math.max(max, num);
        }
        
        System.out.println("Maximum: " + max);
    }
}