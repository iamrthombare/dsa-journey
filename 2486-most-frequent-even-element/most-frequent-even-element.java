import java.util.*;

class Solution {
    public int mostFrequentEven(int[] arr) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                a.add(num);
            }
        }

        int maxFreq = 0;
        int result = -1;

        for (int i = 0; i < a.size(); i++) {

            int count = 0;

            for (int j = 0; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    count++;
                }
            }

            if (count > maxFreq || (count == maxFreq && a.get(i) < result)) {
                maxFreq = count;
                result = a.get(i);
            }
        }

        return result;
    }
}