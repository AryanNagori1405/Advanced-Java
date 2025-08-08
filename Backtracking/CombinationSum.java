package com.aryan.Backtracking;

import java.util.List;
import java.util.ArrayList;

class CombinationSum {

    public static void main(String[] args) {

        int[] candidates = {2,3,6,7};
        int target = 7;

        List<List<Integer>> ans = combinationSum(candidates, target);
        System.out.println(ans);
    }
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        findCombinationSum2(candidates, target, 0, new ArrayList<>(), result);
        
        return result;
    }

    public static void findCombinationSum(int[] candidates, int target, int index,
            int total, ArrayList<Integer> currCombo, List<List<Integer>> result) {

        if (total == target) {
            result.add(new ArrayList<>(currCombo));
            return;
        }

        if (total > target || index >= candidates.length) {
            return;
        }

        currCombo.add(candidates[index]);
        findCombinationSum(candidates, target, index, total + candidates[index], currCombo, result);

        currCombo.removeLast();
        findCombinationSum(candidates, target, index + 1,
                total, currCombo, result);
    }

    public static void findCombinationSum2(int[] candidates, int target, int start,
        ArrayList<Integer> currCombo, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(currCombo));
            return;
        }

        if (target > 0) {
            return;
        }

        for (int index = start; index < candidates.length; index++) {
            currCombo.add(candidates[start]);
            findCombinationSum2(candidates, target - candidates[index], index, currCombo, result);
            currCombo.removeLast();
        }
    }
}