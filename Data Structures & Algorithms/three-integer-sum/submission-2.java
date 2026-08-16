class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i-1>=0 && nums[i]==nums[i-1]) continue;
            int second = i+1,third=n-1;
            while(second<third){
                int sum = nums[i]+nums[second]+nums[third];
                if(sum==0){
                    res.add(List.of(nums[i],nums[second],nums[third]));
                    while(second<third && nums[second]==nums[second+1]) second++;
                    second++;
                    third--;
                }else if(sum>0) third--;
                else second++;
            }
        }
        return res;
    }
}
