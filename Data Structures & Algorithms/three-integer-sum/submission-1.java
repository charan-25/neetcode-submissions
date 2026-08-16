class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int first = nums[i];
            int second = i+1,third=n-1;
            while(second<third){
                int sum = first+nums[second]+nums[third];
                if(sum==0){
                    set.add(List.of(first,nums[second],nums[third]));
                    second++;
                    third--;
                }else if(sum>0) third--;
                else second++;
            }
        }
        return new ArrayList<>(set);
    }
}
