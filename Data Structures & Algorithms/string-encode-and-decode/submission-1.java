class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> list = new ArrayList<>();

        while(i<str.length()){
            int j =i;
            while(str.charAt(j)!= '#')j++;

            int len = Integer.parseInt(str.substring(i,j));
            j++;

            list.add(str.substring(j,j+len));
            i = j+len;
        }
        return list;
    }
}
