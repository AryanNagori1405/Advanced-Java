package BasicsOfRecursion;

// Example:
// Input: num = 8
// Output: 4
// Explanation:
    // Step 1) 8 is even; divide by 2 and obtain 4.
    // Step 2) 4 is even; divide by 2 and get 2.
    // Step 3) 2 is even; divide by 2 and get 1.
    // Step 4) 1 is odd; subtract 1 and get 0.

class ReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        return countNumberOfSteps(num, 0);
    }

    public static int countNumberOfSteps(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 2 == 0) {
            return countNumberOfSteps(n / 2, count + 1);
        } else {
            return countNumberOfSteps(n - 1, count + 1);
        }
    }
}