import java.util.ArrayList;

public class Solution {

    public static void main(String[] args){
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        ArrayList<Character> charList = new ArrayList<Character>();

        // Store the vowels in charList in reverse order
        for(int i = s.length() - 1; i >= 0; i--){
            if(isVowel(s.charAt(i))) {
                charList.add(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        int j = 0;

        for(int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))) {
                result.append(charList.get(j));
                j++;
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }
}
