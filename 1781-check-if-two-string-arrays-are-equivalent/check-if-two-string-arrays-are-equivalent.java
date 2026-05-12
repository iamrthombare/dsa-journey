class Solution {
    public boolean arrayStringsAreEqual(String[] w, String[] w1) {
        String arr = String.join("", w);
        String arr1 = String.join("", w1);

        return arr.equals(arr1);
    }
}