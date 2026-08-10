class Solution {
    public String reverseWords(String s) {
        StringBuilder st = new StringBuilder("");
        String[] words = s.split("\\s+");
        for (int i = words.length-1; i >= 0 ; i--) {
            st.append(words[i]).append(" ");
        }
        return st.toString().trim();
    }
}