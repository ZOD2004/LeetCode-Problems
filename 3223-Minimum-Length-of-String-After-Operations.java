class Solution {
    public int minimumLength(String s) {
        int []a=new int[26];
        int c=0;
        for(int i=0;i<s.length();i++){
            a[(int)s.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            while(a[i]>=3){
                a[i]-=2;
            }
            c+=a[i];
        }
            
        return c;
        
        
    }
}