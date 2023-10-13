class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        ArrayList<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies >= max) ? true : false);
      
        }
    
    return result;

        
        
    }
}