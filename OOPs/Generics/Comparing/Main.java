package com.aryan.OOPs.Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student sumeet = new Student(52, 98.98f);
        Student nikhil = new Student(50, 95.95f);
        Student aryan = new Student(51, 99.99f);
        Student shinu = new Student(53, 97.97f);
        Student gourav = new Student(40, 94.94f);

        Student[] list = {sumeet, nikhil, aryan, shinu, gourav};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });
//        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

//        if (aryan.compareTo(sumeet) < 0) {
//            System.out.println(aryan.compareTo(sumeet));
//            System.out.println("Sumeet has more marks");
//        }
    }
}
