class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int candy=1;
        int a[]=new int[num_people];
        int i=0;
        while(candies-candy>=0){
           a[i%num_people]+=candy;
            candies-=candy;
            candy++;
            i++;
        }
        
        a[i%num_people]+=candies;
        
        return a;
    }
}