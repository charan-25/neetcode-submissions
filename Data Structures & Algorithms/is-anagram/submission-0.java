class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m= t.length();
        if(n!=m) return false;
        char[] ch = new char[26];
        for(int i=0;i<n;i++) ch[s.charAt(i)-'a']++;

        for(int i=0;i<m;i++) ch[t.charAt(i)-'a']--;

        for(int i=0;i<26;i++){
            if(ch[i]!=0) return false;
        }
        return true;
    }
}
