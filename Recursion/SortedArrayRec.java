package BasicsOfRecursion;

public class SortedArrayRec {
    public static void main(String[] args) {
        System.out.println(sortedOrNot(new int[]{1, 2, 3, 4, 5}, 0));
    }

    public static boolean sortedOrNot(int[] arr, int index) {
        // base condition
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sortedOrNot(arr, index + 1);
    }
}
