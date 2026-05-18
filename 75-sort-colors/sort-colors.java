class Solution {
    public void sortColors(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = k;
        }
    }
}