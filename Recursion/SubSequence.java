package BasicsOfRecursion;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subSequenceRet("", "abc");
    }

    private static void subSequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subSequence(processed + ch, unprocessed.substring(1));
        subSequence(processed, unprocessed.substring(1));
    }

    private static ArrayList<String> subSequenceRet(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subSequenceRet(processed + ch, unprocessed.substring(1));
        ArrayList<String> right = subSequenceRet(processed, unprocessed.substring(1));

        left.addAll(right);
        return left;
    }

    private static void subSequenceAscii(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subSequenceAscii(processed + ch, unprocessed.substring(1));
        subSequenceAscii(processed, unprocessed.substring(1));
        subSequenceAscii(processed + (ch+0), unprocessed.substring(1));
    }

    private static ArrayList<String> subSequenceAsciiRet(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> first = subSequenceAsciiRet(processed + ch, unprocessed.substring(1));
        ArrayList<String> second = subSequenceAsciiRet(processed, unprocessed.substring(1));
        ArrayList<String> third = subSequenceAsciiRet(processed + (ch+0), unprocessed.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
