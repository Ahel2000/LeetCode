class Solution {
    HashMap<String,String> map=new HashMap<>();
    List<String> fin=new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        if(digits.length()!=0)getCombinations("",digits);
        return fin;
    }
    
    public void getCombinations(String output,String digits){
        if(digits.length()==0)fin.add(output);
        else{
            String digit=digits.substring(0,1);
            String letters=map.get(digit);
            for(int i=0;i<letters.length();i++){
                getCombinations(output+letters.substring(i,i+1),digits.substring(1));
                
            }
        }
    }
}
