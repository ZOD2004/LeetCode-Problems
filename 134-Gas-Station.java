class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            tot+=gas[i]-cost[i];
        }
        if(tot<0){
            return -1;
        }
        int curr=0,ans=0;
        for(int i=0;i<n;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                ans=i+1;
            }
        }
        return ans;
    }
}