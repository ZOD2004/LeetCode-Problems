class Solution {
    public int reverse(int x) {
        try{
            String q=new StringBuilder().append(Math.abs(x)).reverse().toString();
            return (x<0)? Integer.parseInt(q)*-1:Integer.parseInt(q);
        }catch(Exception e){
            return 0;
        }
    }
}