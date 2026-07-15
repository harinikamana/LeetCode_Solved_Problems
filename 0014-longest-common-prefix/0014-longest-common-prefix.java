class Solution {
    public String validPrefix(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        int i = 0;
        while (i < minLength && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        return a.substring(0, i);
    }
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i = 1; i < strs.length; i++) {
            first = validPrefix(first, strs[i]);
            if (first.equals("")) {
                break;
            }
        }
        return first;
    }
}