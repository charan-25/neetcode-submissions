class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char[] chArray = new char[26];
            for(char ch:strs[i].toCharArray()) chArray[ch-'a']++;
            String str= new String(chArray);
            if(map.containsKey(str)){
                List<String> list = map.get(str);
                list.add(strs[i]);
                map.put(str,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);            
            }
        }
        return new ArrayList<>(map.values());
    }
}
