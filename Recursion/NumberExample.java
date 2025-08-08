package BasicsOfRecursion;

public class NumberExample {
    public static void main (String[] args) {
        // write a function that takes in a number and prints it
        // print first 4 numbers: 1 2 3 4
        print1(1);
    }

    private static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    private static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    private static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    private static void print4(int n) {
        System.out.println(n);
    }
}
