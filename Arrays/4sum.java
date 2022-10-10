 public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        int l = nums[left];
                        while (l == nums[left] && left < right) {
                            left++;
                        }
                    }
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>();
        for (List<Integer> l : res) {
            Collections.sort(l);
            set.add(l);
        }
        return new ArrayList<>(set);
    }
ksum:

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(0, 4, nums, target);
    }
    // note: long type for target to prevent integer overflow
    private List<List<Integer>> kSum(int start, int k, int[] nums, long target) {
        List<List<Integer>> res = new ArrayList<>();
        /**
         * skip searching if:
         * 1. there are less than k elements in nums
         * 2. first_element * k already bigger than target
         * 3. last_element * k already smaller than target
         */
        if (start + k > nums.length || nums[start] > target / k || nums[nums.length - 1] < target / k) {
            return res;
        }
        if (k == 2) {
            return twoSum(start, nums, target);
        }
        for (int i = start; i < nums.length; i++) {
            // skip duplicates
            if (i > start && nums[i - 1] == nums[i]) {
                continue;
            }
            for (List<Integer> integers : kSum(i + 1, k - 1, nums, target - (long) nums[i])) {
                List<Integer> list = new ArrayList<>(integers);
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int start, int[] nums, long target) {
        List<List<Integer>> result = new ArrayList<>();
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            long sum = (long) nums[left] + (long) nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                result.add(Arrays.asList(nums[left], nums[right]));
                int l = nums[left];
                while (left < right && l == nums[left]) {
                    left++;
                }
            }
        }
        return result;
    }
}
