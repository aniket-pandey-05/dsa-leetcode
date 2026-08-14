class Solution {
    public int maximumLengthSubstring(String s) {
        StringBuilder res = new StringBuilder("");
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length(); j++){
                String sub = s.substring(i,j+1);
                char[] arr = sub.toCharArray();
                Arrays.sort(arr);
                int count = 1;
                for(int k = 1; k < arr.length; k++){
                    if(arr[k] == arr[k-1]) count++;
                    else count = 1;
                    if(count > 2) break;
                }
                if(count > 2) break;
                if (sub.length() > res.length()) {
                    res = new StringBuilder(sub);
                };
            }
        }
        return res.length();
    }
}