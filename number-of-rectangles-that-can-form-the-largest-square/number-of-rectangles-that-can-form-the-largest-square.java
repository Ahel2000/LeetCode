class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxlen=0;
        for(int i=0;i<rectangles.length;i++){
            maxlen=Math.max(maxlen,Math.min(rectangles[i][0],rectangles[i][1]));
        }
        
        int num=0;
        for(int i=0;i<rectangles.length;i++){
            if(Math.min(rectangles[i][0],rectangles[i][1])==maxlen)num++;
        }
        
        return num;
    }
}