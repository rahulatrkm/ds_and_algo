class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, max = 0, totalWater = 0;
        while(left < right) {
            if(height[left] < height[right]){
                if(max < height[left]) max = height[left++];
                else totalWater += max - height[left++];
            }
            else {
                if(max < height[right]) max = height[right--];
                else totalWater += max - height[right--];
            }
        }
        
        return totalWater;
    }
}
