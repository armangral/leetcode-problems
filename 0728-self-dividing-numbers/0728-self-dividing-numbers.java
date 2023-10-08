import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> divisors = new ArrayList<>();
        
        for(int i = left; i <= right; i++) {
            int temp = i;
            boolean isSelfDividing = true; 
            
            while (temp > 0 && isSelfDividing) { 
                int digit = temp % 10;
                temp /= 10;
                
                
                if (digit == 0 || i % digit != 0) {
                    isSelfDividing = false; 
                }
            }
            
            if(isSelfDividing) {
                divisors.add(i);
            }
        }
        
        return divisors;
    }
}
