class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> m=new HashMap<>();
        for(String s:strs){
            char []a=s.toCharArray();
            Arrays.sort(a);
            String key=new String(a);
            ArrayList<String> l=m.getOrDefault(key,new ArrayList<String>());
            l.add(s);
            m.put(key,l);
        }
        return new ArrayList<>(m.values());
    }
}