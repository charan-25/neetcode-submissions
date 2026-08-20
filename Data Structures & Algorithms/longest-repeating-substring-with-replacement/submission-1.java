class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] count = new int[26];
        int left=0,right=0,maxFreq=0,ans=0;
        while(right<n){
            char ch = s.charAt(right);
            count[ch-'A']++;
            maxFreq = Math.max(count[ch-'A'],maxFreq);
            while((right-left+1-maxFreq)>k){
                char c = s.charAt(left);
                count[c-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
