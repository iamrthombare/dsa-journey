import java.math.BigInteger;

class Solution {
    public int diagonalPrime(int[][] arr) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            int a = arr[i][i];
            int b = arr[i][arr.length - i - 1];

            if (BigInteger.valueOf(a).isProbablePrime(10)) {
                max = Math.max(max, a);
            }

            if (BigInteger.valueOf(b).isProbablePrime(10)) {
                max = Math.max(max, b);
            }
        }

        return max;
    }
}