package BasicsOfRecursion;

class ReverseStringArray {
    public static void main(String[] args) {
        char[] s = {'a', 'r', 'y', 'a', 'n'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        reverseChar(s, 0, s.length - 1);
    }

    private static void reverseChar(char[] s, int start, int end) {
        if (start > end) {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverseChar(s, start + 1, end - 1);
    }
}