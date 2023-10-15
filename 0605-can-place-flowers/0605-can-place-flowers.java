class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;  
        int possibleFlowers = 0;  

        if(flowerbed.length==1 && flowerbed[0]==0){
            return true;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            
            if (flowerbed[i] == 0) {
                count++;
                
                if (i == 0 || i == flowerbed.length - 1) {
                    count++;
                }
            } else {
                possibleFlowers += (count - 1) / 2;
                count = 0; 
            }
        }

       
        possibleFlowers += (count - 1) / 2;

        return possibleFlowers >= n;
    }
}
