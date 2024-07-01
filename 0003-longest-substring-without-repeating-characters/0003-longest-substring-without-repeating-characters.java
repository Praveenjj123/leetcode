class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
      int n = s.length();
        int[] lastIndex = new int[128]; 
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1; 
        }

        int maxLength = 0;
        int start = 0; 

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            // If the character is repeated, move the start pointer
            if (lastIndex[currentChar] >= start) {
                start = lastIndex[currentChar] + 1;
            }
            // Update the last index of the current character
            lastIndex[currentChar] = end;
            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}








