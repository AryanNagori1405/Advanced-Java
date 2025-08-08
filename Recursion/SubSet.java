package BasicsOfRecursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subSet(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int num : arr) {
            int n = outerList.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(num);
                outerList.add(internalList);
            }
        }
        return outerList;
    }
}
