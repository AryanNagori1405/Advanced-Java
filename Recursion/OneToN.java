package BasicsOfRecursion;

public class OneToN {
    public static void main(String[] args) {
        oneToN(5);
    }

    public static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n-1);
        System.out.println(n);
    }

    public static void nToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        nToOne(n-1);
    }

    public static void both(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
