class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            bound(nums, target, true),
            bound(nums, target, false)
        };
    }

    private int bound(int[] nums, int target, boolean leftBias) {
        int l = 0, r = nums.length - 1, ans = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                ans = m;
                if (leftBias) r = m - 1;
                else l = m + 1;
            }
        }
        return ans;
    }
}