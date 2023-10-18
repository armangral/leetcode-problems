import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        int minValue = Integer.MIN_VALUE;


       
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] == nums1[j]) {
                    nums1[i]=minValue;
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[i] == nums2[j]) {
                    nums2[i]=minValue;
                }
            }
        }
        

   

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]= minValue;
                    nums2[j]=minValue;
                }
            }
        }

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=minValue){
                list1.add(nums1[i]);    
            }
        }

        
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]!=minValue){
                list2.add(nums2[i]);    
            }
        }

        

        result.add(list1);
        result.add(list2);

        return result;
    }
}
