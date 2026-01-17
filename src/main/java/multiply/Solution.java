    package multiply;

    public class Solution {
        public static int multiply(int y, int z) {
            // Return the product y*z;
            if (z == 0) return 0;
            int c = 2;
            return multiply(c * y, (z / c)) + y * (z % c);
        }

        static void main() {
            int y = 3;
            int z = 5;
            int res = multiply(y,z);
            System.out.println(res);
        }
    }
