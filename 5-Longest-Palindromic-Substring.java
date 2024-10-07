class Solution {
    String ans=\\;
    public void check(int l,int r,String s){
        // System.out.println(l+\ \+r);
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            if(r-l+1 > ans.length()){
                ans=s.substring(l,r+1);
            }
            l--;
            r++;
        }
    }
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            check(i,i,s);
            check(i,i+1,s);
        }
        return ans;
    }
    
}