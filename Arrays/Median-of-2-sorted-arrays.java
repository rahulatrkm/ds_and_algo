class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans;
        double med;
        int[] nums = new int[(nums1.length + nums2.length)];
        for(int i=0; i< nums1.length; i++){
            nums[i] = nums1[i];
        }
        for(int i=nums1.length; i<(nums1.length + nums2.length); i++){
            nums[i] = nums2[i-nums1.length];
        }
        Arrays.sort(nums);
         ans = (nums1.length + nums2.length)/2;
        if((nums1.length + nums2.length)%2==0){
            med = (nums[ans-1] + nums[ans])/2.0;
        }
        else{
            med = nums[ans];
        }
        return med;
    }
}
