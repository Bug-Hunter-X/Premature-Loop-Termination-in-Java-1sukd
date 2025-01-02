public class BugSolution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        boolean sumExceededTen = false;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 10) {
                sumExceededTen = true; // Set a flag instead of breaking
            }
        }
        System.out.println("Sum: " + sum);
        if (sumExceededTen) {
            System.out.println("Sum exceeded 10");
        }
    }
}