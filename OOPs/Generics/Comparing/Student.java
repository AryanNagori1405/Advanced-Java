package com.aryan.OOPs.Generics.Comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("In compareTo method");
        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller
        return (int)(this.marks - o.marks);
    }
}
