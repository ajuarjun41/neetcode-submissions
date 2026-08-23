class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int n= s.length();

        int[] letterCount = new int[26];

        for(int i=0;i<n;i++){
            letterCount[s.charAt(i) -'a']++;
            letterCount[t.charAt(i) -'a']--;
        }

        for(int letter :letterCount  ){
            if(letter!=0){
                return false;
            }
        }

        return true;

    }
}
