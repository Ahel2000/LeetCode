class Solution {
    public List<Integer> visited=new ArrayList<>();
    public boolean canReach(int[] arr, int start) {
        if(start>=0 && start<=arr.length-1 && !visited.contains(start)){
            if(arr[start]==0)return true;
            visited.add(start);
            if(canReach(arr,start-arr[start])||canReach(arr,start+arr[start]))return true;
        }
        return false;
    }
}
