class Solution {

    public int countSegments(String s) {

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {

                if (!inWord) {
                    count++;
                    inWord = true;
                }

            } else {
                inWord = false;
            }
        }

        return count;
    }
}