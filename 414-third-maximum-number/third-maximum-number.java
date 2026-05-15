class Solution {
    public int thirdMax(int[] nums) {

        Long v1 = null;
        Long v2 = null;
        Long v3 = null;

        for (int num : nums) {

            long n = num;

            
            if ((v1 != null && n == v1) ||
                (v2 != null && n == v2) ||
                (v3 != null && n == v3)) {
                continue;
            }

    
            if (v1 == null || n > v1) {
                v3 = v2;
                v2 = v1;
                v1 = n;
            }

            
            else if (v2 == null || n > v2) {
                v3 = v2;
                v2 = n;
            }

            
            else if (v3 == null || n > v3) {
                v3 = n;
            }
        }

        return (v3 == null) ? v1.intValue() : v3.intValue();
    }
}