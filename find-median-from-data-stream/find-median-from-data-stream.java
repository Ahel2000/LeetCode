class MedianFinder {
    int size;
    List<Double> l;
    /** initialize your data structure here. */
    public MedianFinder() {
        size=0;
        l=new ArrayList<>();
    }
    
    public void addNum(int num) {
        l.add((double)num);
        size++;
        Collections.sort(l);
    }
    
    public double findMedian() {
        int n=(int)size/2;
        if(size%2==1)return l.get(n);
        else return (l.get(n-1)+l.get(n))/2;
    }
}
​
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
