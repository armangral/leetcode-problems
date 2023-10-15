public class Solution {



    public  int minimumSwap(String s1, String s2) {
        if (s1.length() != s2.length()) return -1;

        int xy = 0, yx = 0;

        // Count mismatched pairs
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xy++;
            } else if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                yx++;
            }
        }

        // If the count of 'x' and 'y' is odd, then it's impossible to make the strings equal
        if ((xy + yx) % 2 == 1) return -1;

        // Return half of the sum of mismatches
        // We use (xy + 1) / 2 to handle the case where xy is odd
        return (xy + 1) / 2 + (yx + 1) / 2;
    }
}
