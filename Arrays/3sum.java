class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left_pointer = 0;
        int right_pointer = 0;
        int sub_sum = 0;

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length; i++) {
            if( i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            left_pointer = i + 1;
            right_pointer = nums.length - 1;
            sub_sum = -nums[i];
            while(left_pointer < right_pointer) {
                if((left_pointer > i + 1 && nums[left_pointer] == nums[left_pointer - 1]) && (right_pointer < nums.length - 1 && nums[right_pointer] == nums[right_pointer + 1])){
                    left_pointer++;
                    right_pointer--;
                    continue;
                }

                if(nums[left_pointer] + nums[right_pointer] == sub_sum) {
                    List<Integer> triplet = Arrays.asList(new Integer[]{-sub_sum, nums[left_pointer], nums[right_pointer]});
                    result.add(triplet);
                    left_pointer++;
                    right_pointer--;
                }
                else if(nums[left_pointer] + nums[right_pointer] < sub_sum) {
                    left_pointer++;
                }else {
                    right_pointer--;
                }
            }
        }
        return result;
    }
}
