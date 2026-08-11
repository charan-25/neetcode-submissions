class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n = nums.length;
       if(n==1) return nums;
       PriorityQueue<int[]> que = new PriorityQueue<>((a,b)->a[1]-b[1]);
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }

       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(que.size()<k) que.add(new int[]{entry.getKey(),entry.getValue()});
            else if(que.peek()[1]<entry.getValue()){
                que.remove();
                que.add(new int[]{entry.getKey(),entry.getValue()});
            } 
       }

       int[] res = new int[k];
       for(int i=0;i<k;i++) {
            res[i] = que.remove()[0];
       }
       return res;
    }
}
