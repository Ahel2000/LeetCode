class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        for(int num : nums1){
            set1.add(num);
        }
        
        for(int num : nums2){
            set2.add(num);
        }
        
        List<Integer> l=new ArrayList<>();
        Iterator<Integer> itr=set1.iterator();
        while(itr.hasNext()){
            int p=itr.next();
            if(set2.contains(p))l.add(p);
        }
        
        int a[]=new int[l.size()];
        for(int i=0;i<a.length;i++){
            a[i]=l.get(i);
        }
        
        return a;
    }
}