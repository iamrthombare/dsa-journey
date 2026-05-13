class Solution {

    public int alternateDigitSum(int n) {

        int sum = 0;
        int sign = 1;

        while(n > 0) {

            int digit = n % 10;

            sum += digit * sign;

            sign *= -1;

            n /= 10;
        }

        // fix sign depending on digit count
        return sign == 1 ? -sum : sum;
    }
}