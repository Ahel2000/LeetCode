class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int [][]queue=new int[people.length][];
        Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1,int[] o2){
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0]; // shorter first
                } else {
                    return o2[1] - o1[1]; // higher order first
                }
            }
        });
        
        int n=people.length;
        
        
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=i;
        
        for(int i=0;i<n;i++){
            
            int counter=0;
            int get=0;
            for(int j=0;j<n;j++){
                if(a[j]!=-1){
                    if(people[i][1]==counter){
                        a[j]=-1;
                        get=j;
                        break;
                    }
                    counter++;
                }
            }
            queue[get]=people[i];
        }
        return queue;
    }
}