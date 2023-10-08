class Solution {
    public double average(int[] salary) {

        int smallest = salary[0], largest = salary[0], sum = salary[0];

        for(int i = 1; i < salary.length; i++) {
            sum += salary[i];
            
            if(salary[i] < smallest) {
                smallest = salary[i];
            }
            
            if(salary[i] > largest) {
                largest = salary[i];
            }
        }

        sum -= (smallest + largest);

        return (double) sum / (salary.length - 2);
    }
}
