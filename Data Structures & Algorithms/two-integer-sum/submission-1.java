class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> aHashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainder = target - nums[i];
            Integer index = aHashMap.get(remainder);
            if (index!=null) return new int[]{index,i};
            aHashMap.put(nums[i],i);
        }

         throw new IllegalArgumentException("no indexes");
        
    }
}
