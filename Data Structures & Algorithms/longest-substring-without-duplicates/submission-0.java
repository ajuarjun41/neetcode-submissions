class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;

        HashMap<Character, Integer> hasSeen = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        int right = 0;

        for (right = 0; right < s.length(); right++) {
            if (hasSeen.containsKey(s.charAt(right)) && hasSeen.get(s.charAt(right)) >= left) {
                left = hasSeen.get(s.charAt(right)) + 1;
            }
            hasSeen.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
    
}

