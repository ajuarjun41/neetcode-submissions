class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j =0;
        int maxCount =0;
        int[] count = new int[26];
        int result =0;

        for(j=0;j<s.length();j++){
            int idx = s.charAt(j)-'A';
            count[idx]++;
            maxCount =Math.max(maxCount,count[idx]);

            int windowSize = j-i+1;

            if(windowSize-maxCount >k){
                 count[s.charAt(i)-'A']--;
                 i++;
            }

         result = Math.max(result ,j-i+1);

        }

        return result;
    }
}
