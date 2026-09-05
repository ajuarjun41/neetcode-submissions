class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res =0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int num:set){
            if(set.contains(num-1)) continue;
           int count = 0;
           int value = num;
           while(set.contains(value)){
            count++;
            value++;
           }

           res =Math.max(count,res);
        }

        return res;
    }
}
