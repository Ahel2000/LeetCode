class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=String.valueOf(nums[i]);
        }
        
        Arrays.sort(str,new stringComparator());
        
        if(str[0].equals("0"))return "0";
        String s="";
        for(int i=0;i<n;i++){
            s+=str[i];
        }
        
        return s;
    }
    
    private class stringComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
           return order2.compareTo(order1);
        }
    }
}