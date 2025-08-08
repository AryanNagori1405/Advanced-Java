package com.aryan.OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        arr.forEach((item) -> System.out.println(2 * item));

        // you can assign "(item) -> System.out.println(item * 2)"
        // this to variable that are type interface
        // bcz the implementation is provided here "System.out.println(item * 2)"
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = Integer::sum; // OR (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;
        Operation sub = (a, b) -> a - b;

        LambdaFunction myCalculator = new LambdaFunction();
        System.out.println(myCalculator.operate(5,3, sum));
        System.out.println(myCalculator.operate(5,3, product));
        System.out.println(myCalculator.operate(5,3, div));
        System.out.println(myCalculator.operate(5,3, sub));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}


// At run-time, it decides which body to be executed
@FunctionalInterface
interface Operation {
    int operation(int a, int b);
}