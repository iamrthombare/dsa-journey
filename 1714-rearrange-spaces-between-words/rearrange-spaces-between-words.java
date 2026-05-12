class Solution {

    public String reorderSpaces(String text) {

        int spaces = 0;

        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                spaces++;
            }
        }

        String[] words = text.trim().split("\\s+");

        int gap = words.length == 1 ? 0 : spaces / (words.length - 1);
        int extra = words.length == 1 ? spaces : spaces % (words.length - 1);

        String space = " ".repeat(gap);

        String ans = String.join(space, words);

        ans += " ".repeat(extra);

        return ans;
    }
}