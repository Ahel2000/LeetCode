class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        
        String x = "";
        char carry='0';
        for(int i=0;i<Math.min(m,n);i++){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if(carry=='0'){
                    x = x + '0';
                    carry = '1';
                }else{
                    x = x + '1';
                    carry = '1';
                }
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                if(carry == '0'){
                    x = x + '0';
                    carry = '0';
                }else{
                    x = x + '1';
                    carry = '0';
                }
            }else{
                if(carry == '0'){
                    x = x + '1';
                    carry = '0';
                }else{
                    x = x + '0';
                    carry = '1';
                }
            }
        }
        
        for(int i=Math.min(m,n);i<m;i++){
            if(a.charAt(i)=='0'){
                if(carry=='1'){
                    x = x + '1';
                    carry = '0';
                }else{
                    x = x + '0';
                    carry = '0';
                }
            }else{
                if(carry=='1'){
                    x = x + '0';
                    carry = '1';
                }else{
                    x = x + '1';
                    carry = '0';
                }
            }
        }
        
        for(int i=Math.min(m,n);i<n;i++){
            if(b.charAt(i)=='0'){
                if(carry=='1'){
                    x = x + '1';
                    carry = '0';
                }else{
                    x = x + '0';
                    carry = '0';
                }
            }else{
                if(carry=='1'){
                    x = x + '0';
                    carry = '1';
                }else{
                    x = x + '1';
                    carry = '0';
                }
            }
        }
        
        if(carry=='1')x = x + '1';
        
        return new StringBuilder(x).reverse().toString();
    }
}