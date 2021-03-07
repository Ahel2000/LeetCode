class Solution {
    public int minSetSize(int[] arr) {
        int removed=0;
        
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        
        int a[]=new int[map.size()];
        int k=0;
        for(Map.Entry mapEl : map.entrySet()){
           a[k++]=(int)mapEl.getValue(); 
            
        }
        
        Arrays.sort(a);
        int num=0;
        for(int i=map.size()-1;i>=0;i--){
            removed+=a[i];
            num++;
            if(removed>=arr.length/2){
                break;
            }
        }
        
        return num;
    }
}