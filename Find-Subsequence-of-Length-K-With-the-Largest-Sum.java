class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<k;i++){
            pq.add(new int[]{i,nums[i]});
        }
        for(int i=k;i<nums.length;i++){
            int curr[]=pq.peek();
            if(nums[i]>curr[1]){
                pq.poll();
                pq.add(new int[]{i,nums[i]});
            }
        }
        PriorityQueue<int[]>max=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i[]:pq){
            max.add(i);
        }
        // System.out.println(max);
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=max.poll()[1];
        }
        return ans;
    }
}