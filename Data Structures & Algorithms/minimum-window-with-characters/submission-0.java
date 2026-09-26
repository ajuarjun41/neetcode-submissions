class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> need = new HashMap<Character,Integer>();

        for(char c : t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        int left=0;
        int right=0;
        int bestStart=0;
        int bestLength =Integer.MAX_VALUE;
        HashMap<Character,Integer> window = new HashMap<Character,Integer>();
        int have =0;
        int required = need.size();

        for(right=0;right<s.length();right++){
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c) && need.get(c).intValue() ==window.get(c).intValue()){
                have++;
            }

            while(have==required){
              if(right-left+1 < bestLength){
                bestLength = right-left+1;
                bestStart = left;
              }
              char leftChar = s.charAt(left);
              window.put(leftChar ,window.get(leftChar)-1);
              if(need.containsKey(leftChar) && window.get(leftChar) <need.get(leftChar)){
                have--;
              }
              left++;

            }
        }

        if(bestLength == Integer.MAX_VALUE){
            return "";
        }

        return s.substring(bestStart,bestStart+bestLength);
        
    }
}
