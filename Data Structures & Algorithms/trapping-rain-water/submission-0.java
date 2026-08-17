class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] pf = new int[n];
        pf[0] = height[0];
        for(int i=1;i<n;i++) pf[i] = Math.max(pf[i-1],height[i]);

        int[] sf = new int[n];
        sf[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--) sf[i] = Math.max(sf[i+1],height[i]);

        int sum =0;
        for(int i=0;i<n;i++){
            int min = Math.min(sf[i],pf[i]);
            int curr = min - height[i];
            sum+=curr;
        }
        return sum;
    }
}
