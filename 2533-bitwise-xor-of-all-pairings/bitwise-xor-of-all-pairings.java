class Solution {
    public int xorAllNums(int[] b, int[] a) {
        int x = 0;

        if (b.length % 2 == 1) {
            for (int n : a) {
                x ^= n;
            }
        }

        if (a.length % 2 == 1) {
            for (int n : b) {
                x ^= n;
            }
        }

        return x;
    }
}