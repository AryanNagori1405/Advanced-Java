package BasicsOfRecursion;

public class MessageExample {
    public static void main (String[] args) {
        // write a function that prints hello world
        message();
    }

    private static void message() {
        System.out.println("Hello World!");
        message1();
    }

    private static void message1() {
        System.out.println("Hello World!");
        message2();
    }

    private static void message2() {
        System.out.println("Hello World!");
        message3();
    }

    private static void message3() {
        System.out.println("Hello World!");
    }
}
