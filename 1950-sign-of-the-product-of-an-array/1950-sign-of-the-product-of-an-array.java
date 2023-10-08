class Solution {
    public int arraySign(int[] nums) {
        int a = 0,c=0;
        for (int i=0;i<nums.length;i++){

            if(nums[i]==0){
                return c;
              
            }
            else if (nums[i] < 0){
                a++;
            }
        }

        return (a%2==0) ? 1  :-1 ;
        
    }
}