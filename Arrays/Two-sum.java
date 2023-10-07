class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        int[] resp = new int[2];
        int i=0;
        for(int num : nums){
            map.put(num, i);
            i++;
        }
     
        
        for(int j=0; j<nums.length; j++){
            int first=nums[j];
            int second= target-first;
            if(map.containsKey(second) && j!=map.get(second)){
                resp[0]=j;
                resp[1]=map.get(second);
                return resp;
            }
        }
        return resp;
    }
}
