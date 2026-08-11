class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
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
