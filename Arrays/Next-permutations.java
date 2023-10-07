class Solution {
    public void nextPermutation(int[] nums) {
        int max  = 0;
        int position = 0;
        
        //Find strictly decreasing sequence starting from the last element and corresponding pivot
        int pivot = nums.length-1;   
        for(int x = pivot ; x >= 1; x--){
            if(nums[x]>nums[x-1]){
                pivot = x-1;
                break;
            }
        }
        //Find the next greatest number from the pivot to the end of the array
        int nextGreatest = Integer.MAX_VALUE;
        int nextGreatestPos = 0;
        for(int x = pivot+1; x < nums.length;x++){
            if(nums[x]<=nextGreatest && nums[x]>nums[pivot]){
                nextGreatest = nums[x];
                nextGreatestPos= x;
                
            }
        }
        if(nextGreatest == Integer.MAX_VALUE){
          nextGreatest = nums[0];
         }

        int holder = nums[pivot];
        //Handles edge case where no increasing sequence from the end is found
        if(pivot == nums.length-1){
            int temp = nums[0];
            nums[0] = nums[nums.length-1];
            nums[nums.length-1] = temp;
            reverseSublist(nums,1,nums.length-2);
            return;
            
        }
        
        nums[pivot] = nextGreatest;
        nums[nextGreatestPos] = holder;
   
        reverseSublist(nums,pivot+1,nums.length-1);

     
        
    }
    /**
    Reverses a sublist of an array from a particular given range.
    @param arr - array 
    @param start - beginning index of the sublist
    @param finish - ending index of the sublist    
    */
    public static void reverseSublist(int[] arr, int start, int finish){
        while(start<finish){
            int Holder = arr[start];
            arr[start] = arr[finish];
            arr[finish] = Holder;
            start++;
            finish--;

            
        }
       
    }
   
}
