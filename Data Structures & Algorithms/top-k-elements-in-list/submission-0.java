class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<List<Integer>> bucket = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int i=0;i<n+1;i++){
            bucket.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> m :map.entrySet() ){
           bucket.get(m.getValue()).add(m.getKey());
        }

        int[] res = new int[k];
        int idx =0;

        for(int i=n;i>=1;i--){
            List<Integer> bucketList = bucket.get(i);
            if(!bucketList.isEmpty()){
                for(int bucketValue: bucketList){
                    res[idx++] = bucketValue;
                     if(idx ==k) return res;
                }
               
            }
        }

        return res;

        
    }
}
