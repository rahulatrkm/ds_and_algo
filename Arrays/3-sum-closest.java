class Solution {
  	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        
        int minDiff = Integer.MAX_VALUE;
        int res = 0;
        int n = nums.length;
        for (int i=0;i<n-2;i++){
            
            int j = i+1;
            int k = n-1;
            
            while (j<k){
                
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(sum - target);
                
                // if sum == target then closed sum is 0 only.
                if (diff == 0) return sum;
                
                // if the diff between sum and target is minimum of last calculated minDiff
                // we will change the minDiff to latest diff
                if (diff < minDiff){
                    res = sum;
                    minDiff = diff;
                }
                   
                // if sum is greater than target then k-- mean[move to left side] : <<--
                if (sum > target) k--;
                // if sum is lesser than target then j++ mean[move to right side] : -->>
                else if (sum < target) j++;
               
               
                
            }
            
        }
        return res;
    }
}
