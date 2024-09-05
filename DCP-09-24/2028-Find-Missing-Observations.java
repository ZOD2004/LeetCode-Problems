class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        for (int i : rolls) {
            sum += i;
        }
        int div = rolls.length + n;
        int rem = (div * mean) - sum;
        // System.out.println(rem);
        if ( rem<= (6 * n) && rem>0) {
            int a[] = new int[n];
            Arrays.fill(a, 1);
            rem -= n;
            if(rem==0)return a;
            for (int i = 0; i < n; i++) {
                if (rem > 5) {
                    a[i] += 5;
                    rem -= 5;
                } else if(rem>0){
                    a[i] += rem;
                    return a;
                }
                else{
                    break;
                }
            }
        }
        return new int[0];

    }
}