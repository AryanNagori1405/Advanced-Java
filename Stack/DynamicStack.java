package com.aryan.Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // this will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // this will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all the previous items in new data
//            for (int i = 0; i < data.length; i++) {
//                temp[i] = data[i];
//            }
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }

        // at this point, we know that array is not full,
        // insert item
        return super.push(item);
    }
}
