class Solution {
    public String largestGoodInteger(String num) {
        String []a={"999","888","777","666","555","444","333","222","111","000"};
        for(int i=0;i<10;i++){
            if(num.contains(a[i])){
                return a[i];
                }
            }
        return "";
    }
}
