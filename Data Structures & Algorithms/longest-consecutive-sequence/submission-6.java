class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length, count=1;
        HashMap<Integer,Boolean> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<n;i++){
            map.put(nums[i],false);
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])) map.put(nums[i],true);

            int nextNum = nums[i]+1;
            while(map.containsKey(nextNum) && map.get(nextNum)==false){
                count++;
                map.put(nextNum,true);
                nextNum++;
            }

            int prevNum = nums[i]-1;
            while(map.containsKey(prevNum) && map.get(prevNum)==false){
                count++;
                map.put(prevNum,true);
                prevNum--;
            }

            ans = Math.max(ans,count);
            count =1;
        }
        return ans;
    }
}
