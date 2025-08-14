class Solution {
    public static boolean check(StringBuilder num){
        if((num.charAt(0) == num.charAt(1) && num.charAt(1) == num.charAt(2))){
            return true;
        }
        return false;
    }
    public String largestGoodInteger(String num) {
        if(num.length()<2){
            return "";
        }
        if(num.length() == 3 && !check(new StringBuilder(num))){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(num.charAt(0));
        sb.append(num.charAt(1));
        sb.append(num.charAt(2));
        Set<String>set=new TreeSet<>();
        if(check(sb))
        set.add(sb.toString());
        for(int i=3;i<num.length();i++){
            sb.append(num.charAt(i));
            sb.deleteCharAt(0);
            if(check(sb))
            set.add(sb.toString());
        }
        System.out.println(set);
        String ans = "";
        for(String i:set){
            ans=i;
        }
        return ans;
    }
}