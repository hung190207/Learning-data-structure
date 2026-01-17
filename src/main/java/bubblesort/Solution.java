package bubblesort;

import java.util.Arrays;

public class Solution {
    public static int[] bubbleSort(int[] A) {
        for (int i = A.length; i >= 1; i--) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }

    static void main() {
        int[] arr = {4, 5, 6, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
