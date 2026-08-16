class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length, count=0;
        if(n==0) return 0;
        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int longest =1;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastSmaller){
                count++;
                lastSmaller = nums[i];
            }else if(nums[i]!=lastSmaller){
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(count,longest);
        }
        return longest;
    }
}
