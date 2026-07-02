class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        for (int i = 1; i <= x / 2; i++) {
            if (i <= x / i && (i + 1) > x / (i + 1)) {
                return i;
            }
        }
        return 1;
    }
}