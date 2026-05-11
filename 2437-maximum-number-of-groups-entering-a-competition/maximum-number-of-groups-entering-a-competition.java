class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int groups = 0;
        int total = 0;

        while (total + (groups + 1) <= n) {
            groups++;
            total += groups;
        }

        return groups;
    }
}