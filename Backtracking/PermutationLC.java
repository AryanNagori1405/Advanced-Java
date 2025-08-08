package Backtracking;

import java.util.*;

public class PermutationLC {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // Add a deep copy
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            // Choose
            current.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, current, used, result);

            // Un-choose (backtrack)
            used[i] = false;

//            current.remove(current.size() - 1);
            current.removeLast();  // both are correct
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allPermutations = permute(nums);
        System.out.println(allPermutations);
    }
}
