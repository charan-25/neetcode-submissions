class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        int i=0,j=0;
        while(i<n){
            char ch = s.charAt(i);
            if(!set.contains(ch)) set.add(ch);
            else{
                while(ch!=s.charAt(j)){
                    maxLen = Math.max(maxLen,set.size());
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
            i++;
        }
        return maxLen=Math.max(maxLen,set.size());
    }
}
