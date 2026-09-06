class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            int l = i + 1;
            int r = n - 1;
            while (r > l) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                } else {
                    if (nums[i] + nums[l] + nums[r] > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }

        return new ArrayList<>(res);
    }
}
