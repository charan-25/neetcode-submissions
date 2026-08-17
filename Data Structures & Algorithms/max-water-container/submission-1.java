class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int area = 0;
        int i=0,j=n-1;
        while(i<j){
            int height = Math.min(heights[i],heights[j]);
            int width = j-i;
            area = Math.max(height*width, area);
            if(heights[i]<heights[j])i++;
            else j--;
        }
        return area;
    }
}
