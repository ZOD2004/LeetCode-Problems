class Solution {
    public List<String> wordSubsets(String[] w1, String[] w2) {
        List<String>l=new ArrayList<>();
        int mx[]=new int[26];
        for(String s:w2){
            int wc[]=new int[26];
            for(char i:s.toCharArray()){
                wc[i-'a']++;
            }
            for(int k=0;k<26;k++){
                mx[k]=Math.max(mx[k],wc[k]); 
            }
        }
        for(String s:w1){
            int c[]=new int[26];
            boolean f=true;
            for(char i:s.toCharArray()){
                c[i-'a']++;
            }
            for(int k=0;k<26;k++){
                if(c[k] < mx[k]){
                    f=false;
                    break;
                } 
            }
            if(f)l.add(s);
        }
        return l;
    }
}