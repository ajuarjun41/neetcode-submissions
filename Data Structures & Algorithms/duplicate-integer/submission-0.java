class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> aHashMap = new HashMap<>();

        for(int num :nums){
            if(aHashMap.containsKey(num)){
                aHashMap.put(num,aHashMap.get(num)+1);
                return true;
            }
            else{
                aHashMap.put(num,1);
            }
        }

        return false;
        
    }
}