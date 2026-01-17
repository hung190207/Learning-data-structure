package horner;

public class Solution {
    public static int horner(int[] A, int x) {
        int p = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            p = p * x + A[i];
        }
        return p;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 15;
        System.out.println(horner(arr, x));
    }
}
