class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int total = 0;
        Arrays.sort(people);
        int i = 0,j = people.length - 1;
        while(i <= j){
            int temp = people[i] + people[j];
            if(temp > limit){
                j--;
            }else{
                i++;
                j--;
            }
            
            total++;
        }
        
        
        return total;
    }
}