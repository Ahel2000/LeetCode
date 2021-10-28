class Solution {
    public int countValidWords(String sentence) {
        sentence = sentence.trim();
        String words[] = sentence.split("\\s+");
        int valid = 0;
        for(String word : words){
            if(word.equals(""))continue;
            if(isValid(word))valid++;
        }
        
        return valid;
    }
    
    public boolean isValid(String word){
        int n = word.length();
        int hyphen = 0;
        for(int i=0;i<n;i++){
            if(word.charAt(i) >= '0' && word.charAt(i) <= '9')return false;
            
            if(word.charAt(i) == '-'){
                if(hyphen == 0 && (i - 1 >= 0 && Character.isLowerCase(word.charAt(i-1)) 
                                   && i + 1 < n && Character.isLowerCase(word.charAt(i+1))))hyphen++;
                else return false;
            }
            
            if(word.charAt(i) == ' ' || word.charAt(i) == ',' || word.charAt(i) == '!' || word.charAt(i) == '.'){
                if(i != n - 1)return false;
            }
        }
        
        return true;
    }
}