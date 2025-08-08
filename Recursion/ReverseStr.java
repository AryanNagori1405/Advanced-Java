package BasicsOfRecursion;

class ReverseStr {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        reverseCharacter(s, 0, s.length - 1);
    }

    private static void reverseCharacter(char[] s, int start, int end) {
        if (start > end) {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverseCharacter(s, start + 1, end - 1);
    }
}

//    public void reverseString(char[] s) {
//        int start = 0;
//        int end = s.length - 1;
//
//        while (start < end) {
//            char temp = s[start];
//            s[start] = s[end];
//            s[end] = temp;
//
//            start++;
//            end--;
//        }
//    }
//}