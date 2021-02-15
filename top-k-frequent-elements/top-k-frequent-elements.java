class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);   
        }
        
        int a[][]=new int[map.size()][2];
        int m=0;
        for(Map.Entry mapEl : map.entrySet()){
            a[m][0]=(int)mapEl.getKey();
            a[m][1]=(int)mapEl.getValue();
            m++;
        }
        
        Arrays.sort(a,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[1],b[1])*(-1);
            }
        });
        
        int arr[]=new int[k];
        for(int i=0;i<k;i++)arr[i]=a[i][0];
        return arr;
    }
}