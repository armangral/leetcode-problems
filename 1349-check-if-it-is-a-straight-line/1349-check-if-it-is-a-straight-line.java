public class Solution {

    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        
        
        if (n == 2) return true;

       
        int xDiff = coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < n; i++) {
            int currXDiff = coordinates[i][0] - coordinates[0][0];
            int currYDiff = coordinates[i][1] - coordinates[0][1];

            
            if (xDiff * currYDiff != yDiff * currXDiff) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] coordinates1 = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        int[][] coordinates2 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};

        System.out.println(sol.checkStraightLine(coordinates1));  
        System.out.println(sol.checkStraightLine(coordinates2));  
    }
}