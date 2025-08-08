package BasicsOfRecursion;

// Example:
//        Input: nums = [1,1,1,1,1], target = 3
//        Output: 5
//        Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
//                -1 + 1 + 1 + 1 + 1 = 3
//                +1 - 1 + 1 + 1 + 1 = 3
//                +1 + 1 - 1 + 1 + 1 = 3
//                +1 + 1 + 1 - 1 + 1 = 3
//                +1 + 1 + 1 + 1 - 1 = 3

class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return 0;
    }
}