class Solution {

    public boolean isPalindromic(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            int a = s.charAt(i);

            while (a != 0) {
                ans.append(a % 2);
                a /= 2;
            }

            while (ans.length() % 8 != 0) {
                ans.append('0');
            }
        }

        int start = 0;
        int end = ans.length() - 1;

        while (start < end) {
            if (ans.charAt(start) != ans.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}