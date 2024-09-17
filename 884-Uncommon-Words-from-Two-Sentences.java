class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> l=new ArrayList<>();
        String [] x=s1.split(" ");
        String [] y=s2.split(" ");
        for(String h:x){
            l.add(h);
        }
        for(String h:y){
            l.add(h);
        }
        int b=0;
        ArrayList<String> r=new ArrayList<>();
        for(String h:l){
            if(l.indexOf(h)==l.lastIndexOf(h)){
                r.add(h);
            }
        }
        String []a=new String[r.size()];
        for(String h:r){
            a[b++]=h;
        }
      return a;  
    }
}