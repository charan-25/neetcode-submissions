class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char[] chArray = new char[26];
            for(char ch:strs[i].toCharArray()) chArray[ch-'a']++;
            String str= new String(chArray);
            map.putIfAbsent(str,new ArrayList<>());
            map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
