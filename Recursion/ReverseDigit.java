package BasicsOfRecursion;

class ReverseDigit {
    public static void main(String[] args) {
        int ans = reverse(1234);
        System.out.println(ans);
    }

    public static int reverse(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return getReverse(n, digits); 
    }

    public static int getReverse(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10; 
        return rem * (int)(Math.pow(10, digits-1)) + getReverse(n/10, digits-1);
    }
}