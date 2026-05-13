class Solution {

    public int countEven(int n) {

        int c = 0;

        for(int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            while(num != 0) {

                sum += num % 10;
                num /= 10;
            }

            if(sum % 2 == 0) {
                c++;
            }
        }

        return c;
    }
}