class Solution {
    public String arrangeWords(String text) {
        text+=" ";
        text=text.toLowerCase();
        int spaces=0;
        int n=text.length();
        
        for(int i=0;i<n;i++){
            if(text.charAt(i)==' ')spaces++;
        }
        
        String a[][]=new String[spaces][2];
        
        int index=0;
        String s="";
        int curr=0;
        for(int i=0;i<n;i++){
            char ch=text.charAt(i);
            if(ch!=' '){
                s+=ch;
                curr++;
            }else{
                a[index][0]=s;
                a[index][1]=String.valueOf(curr);
                index++;
                curr=0;
                s="";
            }
        }
        
        
        Arrays.sort(a, new Comparator<String []>() { 
            public int compare(String a[],String b[]) 
            { 
                return (Integer.valueOf(a[1])).compareTo(Integer.valueOf(b[1])); 
            } 
        }); 
        
        
        
        String txt="";
        for(int i=0;i<spaces;i++){
            txt+=a[i][0]+" ";
        }
        
        txt=txt.substring(0,1).toUpperCase()+txt.substring(1,txt.length()-1);
        return txt;
    }
}