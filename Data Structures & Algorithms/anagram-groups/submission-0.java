class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> aHashMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String uniqueId = createUniqueIds(strs[i]);
            aHashMap.computeIfAbsent(uniqueId,k-> new ArrayList<>()).add(strs[i]);
        }

        for(Map.Entry<String,List<String>> map : aHashMap.entrySet()){
            result.add(map.getValue());
        }

        return result;
        
    }

    public String createUniqueIds(String s){
       int[] intArray = new int[26];
       char[] charArray = s.toCharArray();
       StringBuilder sb = new StringBuilder("#");

       for(char c : charArray ){
        intArray[c-'a']++;
       }

       for(int i : intArray){
       sb.append(i);
       sb.append("#");
       }

       return sb.toString();
 
    }
}
