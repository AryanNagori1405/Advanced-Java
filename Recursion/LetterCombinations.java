package BasicsOfRecursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        letterCombination("", "12");

        List<String> result = letterCombinationList("", "12");
        System.out.println(result);

        List<String> result2 = letterCombinationListArg("", "12", new ArrayList<>());
        System.out.println(result2);

        System.out.println(letterCombinationCount("", "12"));

        System.out.println(letterCombinationCountArg("", "12", 0));
    }

    private static void letterCombination(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        // If "12", consider '1' - '0' then 49 - 48 = 1 as an integer
        // Below line will convert char '2' into integer 2
        int firstDigit = unprocessed.charAt(0) - '0';

        for (int i = (firstDigit - 1) * 3; i < firstDigit * 3; i++) {
            char ch = (char)('a' + i);
            letterCombination(processed + ch , unprocessed.substring(1));
        }
    }

    private static List<String> letterCombinationList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        // If "12", consider '1' - '0' then 49 - 48 = 1 as an integer
        // Below line will convert char '2' into integer 2
        int firstDigit = unprocessed.charAt(0) - '0';

        List<String> ans = new ArrayList<>();

        for (int i = (firstDigit - 1) * 3; i < firstDigit * 3; i++) {
            char ch = (char)('a' + i);
            ans.addAll(letterCombinationList(processed + ch , unprocessed.substring(1)));
        }
        return ans;
    }

    private static List<String> letterCombinationListArg(String processed, String unprocessed, List<String> ans) {
        if (unprocessed.isEmpty()) {
            ans.add(processed);
            return ans;
        }
        // If "12", consider '1' - '0' then 49 - 48 = 1 as an integer
        // Below line will convert char '2' into integer 2
        int firstDigit = unprocessed.charAt(0) - '0';

        for (int i = (firstDigit - 1) * 3; i < firstDigit * 3; i++) {
            char ch = (char)('a' + i);
            letterCombinationListArg(processed + ch , unprocessed.substring(1), ans);
        }
        return ans;
    }

    private static int letterCombinationCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        int count = 0;
        int firstDigit = unprocessed.charAt(0) - '0';
        for (int i = (firstDigit - 1) * 3; i < firstDigit * 3; i++) {
            char ch = (char)('a' + i);
            count += letterCombinationCount(processed + ch , unprocessed.substring(1));
        }
        return count;
    }

    private static int letterCombinationCountArg(String processed, String unprocessed, int count) {
        if (unprocessed.isEmpty()) {
            return count + 1;
        }
        int firstDigit = unprocessed.charAt(0) - '0';
        for (int i = (firstDigit - 1) * 3; i < firstDigit * 3; i++) {
            char ch = (char)('a' + i);
            count = letterCombinationCountArg(processed + ch , unprocessed.substring(1), count);
        }
        return count;
    }
}
