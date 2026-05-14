class Solution {
    public List<Integer> selfDividingNumbers(int l, int r) {

        List<Integer> a = new ArrayList<>();

        for (int i = l; i <= r; i++) {

            int t = i;
            boolean flag = true;

            while (t != 0) {

                int last = t % 10;

                // check 0 or not divisible
                if (last == 0 || i % last != 0) {
                    flag = false;
                    break;
                }

                t /= 10;
            }

            // add valid number
            if (flag) {
                a.add(i);
            }
        }

        return a;
    }
}