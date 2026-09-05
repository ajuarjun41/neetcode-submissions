class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int leftIndex=0;
        int rightIndex=n-1;

        while(rightIndex>leftIndex){
            while(rightIndex>leftIndex && !Character.isLetterOrDigit(s.charAt(leftIndex))) leftIndex++;
            while(rightIndex>leftIndex && !Character.isLetterOrDigit(s.charAt(rightIndex))) rightIndex--;
            if(Character.toLowerCase(s.charAt(leftIndex))!=Character.toLowerCase(s.charAt(rightIndex))){
                 return false;
            }
           leftIndex++;
           rightIndex--;

           
        }
        return true;
        
    }
}
