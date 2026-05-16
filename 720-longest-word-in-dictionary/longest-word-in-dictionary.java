import java.util.*;

class Solution {

    public String longestWord(String[] words) {

        HashSet<String> set = new HashSet<>();

        for (String w : words) {
            set.add(w);
        }

        String res = "";

        for (String w : words) {

            boolean valid = true;

            for (int i = 1; i < w.length(); i++) {

                String prefix = w.substring(0, i);

                if (!set.contains(prefix)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {

                if (w.length() > res.length()) {
                    res = w;
                }

                else if (w.length() == res.length()
                        && w.compareTo(res) < 0) {

                    res = w;
                }
            }
        }

        return res;
    }
}