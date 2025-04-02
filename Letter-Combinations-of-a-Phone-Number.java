class Solution {
    public static void back(String dig,StringBuilder sb,int ind,String[]com ,ArrayList<String>ans,int n){
        if(sb.length() == n){
            ans.add(sb.toString());
            return;
        }
        if(ind>=n)return;
        char curr[]=com[dig.charAt(ind)-'0'].toCharArray();
        for(char i:curr){
            sb.append(i);
            back(dig,sb,ind+1,com,ans,n);
            sb.setLength(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String dig) {
        ArrayList<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if(dig.length()<=0){
            // System.out.println(\HI\);
            // ans.add(sb.toString());
            return ans;
        }
        String[]com=new String[10];
        com[2]=\abc\;
        com[3]=\def\;
        com[4]=\ghi\;
        com[5]=\jkl\;
        com[6]=\mno\;
        com[7]=\pqrs\;
        com[8]=\tuv\;
        com[9]=\wxyz\;
        
        
        back(dig,sb,0,com,ans,dig.length());
        return ans;
    }
}