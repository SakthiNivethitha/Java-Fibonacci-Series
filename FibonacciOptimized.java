public class FibonacciOptimized {

    public static void main(String[] args) {

        int n = 10;

        int prev2 = 0;
        int prev1 = 1;

        System.out.println("First " + n + " Fibonacci Numbers:");

        System.out.print(prev2 + " ");
        System.out.print(prev1 + " ");

        for (int i = 2; i < n; i++) {
            int current = prev1 + prev2;
            System.out.print(current + " ");

            prev2 = prev1;
            prev1 = current;
        }
    }
}