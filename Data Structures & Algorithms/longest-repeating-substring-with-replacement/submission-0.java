class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0,right=0,maxFreq=0,ans=0;
        while(right<n){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq = Math.max(map.get(ch),maxFreq);
            while((right-left+1-maxFreq)>k){
                char c = s.charAt(left);
                if(map.get(c)==1) map.remove(c);
                else map.put(c,map.get(c)-1);
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
