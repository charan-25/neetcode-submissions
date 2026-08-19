class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        if(m<n) return false;
        int[] s1char = new int[26];
        for(char ch:s1.toCharArray()) s1char[ch-'a']++;

        int[] s2char = new int[26];
        for(int i=0;i<n;i++) s2char[s2.charAt(i)-'a']++;
        if(Arrays.equals(s1char,s2char)) return true;
        int i=n,j=1;
        while(i<m){
            s2char[s2.charAt(j-1)-'a']--;
            s2char[s2.charAt(i)-'a']++;
            if(Arrays.equals(s1char,s2char)) return true;
            i++;
            j++;
        }
        return false;
    }
}
