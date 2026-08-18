class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen =0;
        HashSet<Character> set = new HashSet<>();
        int j=0,i=0;
        while(i<n){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen,i-j+1);
            i++;
        }
        return maxLen;
    }
}
