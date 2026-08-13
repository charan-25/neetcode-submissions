class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pf = new int[n];
        pf[0] = 1;
        for(int i=1;i<n;i++) pf[i] = pf[i-1]*nums[i-1];

        int[] sf = new int[n];
        sf[n-1] = 1;
        for(int i=n-2;i>=0;i--) sf[i] = sf[i+1] * nums[i+1];

        int[] res = new int[n];
        for(int i=0;i<n;i++) res[i] = sf[i] * pf[i];
        return res;
    }
}  
