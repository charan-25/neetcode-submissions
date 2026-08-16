class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        s = s.trim().toLowerCase();
        char[] ch = s.toCharArray();
        for(char c:ch){
            if((c>='a' && c<='z') || (c>='0' && c<='9')) sb.append(c);
        }
        String isPalindrome = sb.toString();
        int start=0,end=isPalindrome.length()-1;
        while(start<end){
            if(isPalindrome.charAt(start) != isPalindrome.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
