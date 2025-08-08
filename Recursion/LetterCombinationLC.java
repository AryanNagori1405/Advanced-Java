package BasicsOfRecursion;

import java.util.List;
import java.util.ArrayList;

class LetterCombinationLC {
    public static void main(String[] args) {
        List<String> ans = letterCombinations("78");
        System.out.println(ans);
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        } 
        return letterCombinationList("", digits);
//        return letterCombListHelper("", digits);
    }

    // Submitted in Leetcode
    private static List<String> letterCombinationList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        // Let's consider "1", so '1' - '0' would be 49 - 48 = 1 as an integer
        // Below line will convert char '2' into integer 2
        int digit = unprocessed.charAt(0) - '0';

        int i = (digit - 2) * 3;
        if (digit > 7) {
            i += 1;
        }
        
        int len = i + 3;
        if (digit == 7 || digit == 9) {
            len += 1;
        }

        List<String> ans = new ArrayList<>();

        for (; i < len; i++) {
            char ch = (char)('a' + i);
            ans.addAll(letterCombinationList(processed + ch , unprocessed.substring(1)));
        }
        return ans;
    }

    // By DeepSeek AI
    private static List<String> letterCombListHelper(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';
        String letters = getLettersForDigit(digit); // Get letters for the digit

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            ans.addAll(letterCombListHelper(processed + ch, unprocessed.substring(1)));
        }

        return ans;
    }

    // Helper method to map digits to letters
    private static String getLettersForDigit(int digit) {
        return switch (digit) {
            case 2 -> "abc";
            case 3 -> "def";
            case 4 -> "ghi";
            case 5 -> "jkl";
            case 6 -> "mno";
            case 7 -> "pqrs";
            case 8 -> "tuv";
            case 9 -> "wxyz";
            default -> ""; // Handles 0, 1, and other invalid digits
        };
    }
}