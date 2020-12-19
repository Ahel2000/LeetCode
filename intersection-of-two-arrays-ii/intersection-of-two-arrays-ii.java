class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        
        for(int i=0;i<nums1.length;i++){
            if(!map1.containsKey(nums1[i]))map1.put(nums1[i],1);
            else map1.replace(nums1[i],map1.get(nums1[i])+1);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(!map2.containsKey(nums2[i]))map2.put(nums2[i],1);
            else map2.replace(nums2[i],map2.get(nums2[i])+1);
        }
        
        List<Integer> l=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            if(map2.containsKey(nums1[i]) && map2.get(nums1[i])>0){
                l.add(nums1[i]);
                map2.replace(nums1[i],map2.get(nums1[i])-1);
            }
        }
        
        int m[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            m[i]=l.get(i);
        }
        
        return m;
    }
}
