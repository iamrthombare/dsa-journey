import java.util.Arrays;

class Solution {
    public int matrixSum(int[][] nums) {

        int sum = 0;

        // Sort each row
        for (int[] row : nums) {
            Arrays.sort(row);
        }

        // Traverse columns
        for (int col = 0; col < nums[0].length; col++) {

            int max = 0;

            for (int row = 0; row < nums.length; row++) {
                max = Math.max(max, nums[row][col]);
            }

            sum += max;
        }

        return sum;
    }
}