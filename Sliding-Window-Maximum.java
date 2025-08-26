class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        int n = nums.length;
        int a[]=new int [n-k+1];
        for(int i=0;i<n;i++){
            pq.offer(new int[]{nums[i],i});
            while(pq.peek()[1]<= i-k){
                pq.poll();
            }
            if(i >= k-1){
                a[i-k+1] = pq.peek()[0];
            }
        }
        return a;
    }
}