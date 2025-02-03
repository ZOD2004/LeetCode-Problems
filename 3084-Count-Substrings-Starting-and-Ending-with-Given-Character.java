class Solution {
    public long countSubstrings(String s, char ch) {
        long c=0;
        long ans=0;
        for(char i:s.toCharArray()){
            if(i == ch){
                c++;
                ans+=c;
            }
        }
        return ans;
    }
}