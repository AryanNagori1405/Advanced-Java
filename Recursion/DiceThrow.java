package BasicsOfRecursion;

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {
//        diceThrow("", 4);

//        List<String> ans = diceThrowList("", 4);
//        System.out.println(ans);

        List<String> result = diceThrowListArg("", 3, new ArrayList<>());
        System.out.println(result);
    }

    private static void diceThrow(String processed, int target) {
        if (target == 0) {
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceThrow(processed + i, target - i);
        }
    }

    private static List<String> diceThrowList(String processed, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(diceThrowList(processed + i, target - i));
        }
        return ans;
    }

    private static List<String> diceThrowListArg(String processed, int target, List<String> ans) {
        if (target == 0) {
            ans.add(processed);
            return ans;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceThrowListArg(processed + i, target - i, ans);
        }
        return ans;
    }
}
