package BasicsOfRecursion;

import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = {12,45,6,67,67,23,9,67};
        int target = 67;

//        System.out.println(find(arr, target, 0));
//        System.out.println(findFromLast(arr, target, arr.length - 1));
//        System.out.println(findIndex(arr, target, 0));
//        System.out.println(findIndexLast(arr, target, arr.length - 1));
//        System.out.println(findAllIndex(arr, target, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, target, 0));
    }

    public static boolean find(int[] arr, int target, int index) {
        // base condition
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    public static boolean findFromLast(int[] arr, int target, int index) {
        // base condition
        if (index == -1) {
            return false;
        }
        return arr[index] == target || findFromLast(arr, target, index - 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        // base condition
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    public static int findIndexLast(int[] arr, int target, int index) {
        // base condition
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        // base condition
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    // this approach is not recommended bcz on every function call a new ArrayList object is being created.
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // base condition
        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
