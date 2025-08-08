package BasicsOfRecursion;

public class NumberRecursion {
    public static void main (String[] args) {
        // write a function that takes in a number and prints it
        // print first 4 numbers: 1 2 3 4
        print(1);
    }

    private static void print(int n) {
        if (n == 4) {
            System.out.println(4);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling a function again & again, you can treat it as a separate call in the stack.

        // this is called tail recursion
        // this is the last function call
        print(n + 1); // linear recurrence relation
    }
}
