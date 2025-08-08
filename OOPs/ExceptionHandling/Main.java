package com.aryan.OOPs.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        // more strict exception should be declared first,
        // bcz Exception is the highest exception class
        try {
//            System.out.println(divide(a, b));
            // mimicking
//            throw new Exception("just for fun");
            String name = "Aryan";
            if (name.equals("Aryan")) {
                throw new MyException("Name is Aryan");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("I am in finally block and this will always execute");
        }
    }

    static int divide (int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}