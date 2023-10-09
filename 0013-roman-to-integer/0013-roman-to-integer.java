public class Solution {
    private static final int I = 1;
    private static final int V = 5;
    private static final int X = 10;
    private static final int L = 50;
    private static final int C = 100;
    private static final int D = 500;
    private static final int M = 1000;

    public static void main(String[] args) {
        System.out.println(isEqual("IV", 4));
        System.out.println(isEqual("IX", 9)); 
        System.out.println(isEqual("XXI", 20)); 
    }

    public static boolean isEqual(String roman, int value) {
        return romanToInt(roman) == value;
    }

    public static int romanToInt(String s) {
        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentValue = romanCharToInt(c);
            
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
            prevValue = currentValue;
        }

        return sum;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return I;
            case 'V':
                return V;
            case 'X':
                return X;
            case 'L':
                return L;
            case 'C':
                return C;
            case 'D':
                return D;
            case 'M':
                return M;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral: " + c);
        }
    }
}
