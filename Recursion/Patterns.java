package BasicsOfRecursion;

public class Patterns {
    public static void main (String[] args) {
        pattern1(5, 0);
    }

    private static void pattern1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) { 
            pattern1(row, col + 1);
            System.out.print("*");
        } else {
            pattern1(row - 1, 0);
            System.out.println();
        }
    }

    private static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            pattern2(row, col + 1);
        } else {
            System.out.println();
            pattern2(row - 1, 0);
        }
    }
}
