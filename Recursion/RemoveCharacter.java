package BasicsOfRecursion;

public class RemoveCharacter {
    public static void main(String[] args) {
        String s = "baccad";

//        removeChar(s, "");
//        String result = removeCharUsingStr(s, "", 0);
//        String result = String.valueOf(removeCharUsingStrBuld(s, new StringBuilder(), 0));
//        System.out.println(result);
    }

    // Without taking index in function argument
    private static void removeChar(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);

        if (ch == 'a') {
            removeChar(s.substring(1), ans);
        } else {
            removeChar(s.substring(1), ans + ch);
        }
    }

    // Removing the character using String,
    // We are passing the answer in function arguments
    private static String removeCharUsingStr(String s, String ans, int index) {
        if (index == s.length()) {
            return ans;
        }
        if (s.charAt(index) != 'a') {
            ans += s.charAt(index);
        }
        return removeCharUsingStr(s, ans,index+1);
    }

    // Removing the character using StringBuilder,
    // We are passing the answer in function arguments
    private static StringBuilder removeCharUsingStrBuld(String s, StringBuilder ans, int index) {
        if (index == s.length()) {
            return ans;
        }
        if (s.charAt(index) != 'a') {
            ans.append(s.charAt(index));
        }
        return removeCharUsingStrBuld(s, ans,index+1);
    }

    // Here, we are not taking answer in the function argument
    private static String removeChar(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);

        if (ch == 'a') {
            return removeChar(s.substring(1));
        } else {
            return ch + removeChar(s.substring(1));
        }
    }
}
