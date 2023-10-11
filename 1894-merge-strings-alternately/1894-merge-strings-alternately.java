class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        
        int totalLength = length1 + length2;
        
        char[] merged = new char[totalLength];
        int j = 0;
        
        for (int i = 0; i < Math.max(length1, length2); i++) {
            if (i < length1) {
                merged[j++] = word1.charAt(i);
            }
            if (i < length2) {
                merged[j++] = word2.charAt(i);
            }
        }

        return new String(merged);
    }
}
