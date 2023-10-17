class Solution {
    public boolean isSubsequence(String s, String t) {

        int index = 0;
        StringBuilder newstr = new StringBuilder();

        for(int i = 0; i < t.length() && index < s.length(); i++) {
            if(s.charAt(index) == t.charAt(i)) {
                newstr.append(s.charAt(index));
                index++;
            }
        }

        return s.equals(newstr.toString());
    }
}
