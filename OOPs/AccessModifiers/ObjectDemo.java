package com.aryan.OOPs.AccessModifiers;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // already covered these two
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    // unique
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)(obj)).num;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);

        if (obj1 == obj2) {
            System.out.println("obj1 == obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }

        // 'obj1.getClass()' information from this will be stored in the heap
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());

//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
    }
}
