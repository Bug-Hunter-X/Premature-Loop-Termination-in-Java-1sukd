public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 10) {
                System.out.println("Sum exceeded 10");
                break; // Exit loop if sum exceeds 10
            }
        }
        System.out.println("Sum: " + sum);
    }
}