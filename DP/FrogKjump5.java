/*Frog Jump Problem (Classic DP)
A frog is standing at the first step (index 0) of a staircase with N steps.
Each step has a certain height given in an array heights[].
Rules:
The frog can jump:
upto k steps
The energy cost of a jump from step i to step j is:
∣heights[i]−heights[j]∣
*/

import java.util.Arrays;

public class FrogKjump5 {
    
    //  Memoization
    public static int frogjump(int n, int[] steps, int[] dp, int k){
        
        if(n == 0) return 0;

        if(dp[n] != -1) return dp[n];

        int min = Integer.MAX_VALUE;

        for(int j = 1; j <= k; j++){
            if(n - j >= 0){
                int jump = frogjump(n - j, steps, dp, k) 
                          + Math.abs(steps[n] - steps[n - j]);
                min = Math.min(min, jump);
            }
        }

        return dp[n] = min;
    }

    //  Tabulation
    public static int frogjumpT(int n, int[] steps, int[] dp, int k){
        
        dp[0] = 0;

        for(int i = 1; i <= n; i++){

            int min = Integer.MAX_VALUE;

            for(int j = 1; j <= k; j++){
                if(i - j >= 0){
                    int jump = dp[i - j] 
                              + Math.abs(steps[i] - steps[i - j]);
                    min = Math.min(min, jump);
                }
            }

            dp[i] = min;
        }

        return dp[n];
    }

    public static void main(String args[]){

        int[] arr = {30,10,60,30,60,50,40};
        int n = arr.length - 1;
        int k = 3;

        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        
        System.out.println(frogjump(n, arr, dp, k));

        Arrays.fill(dp, 0);

       
        System.out.println(frogjumpT(n, arr, dp, k));
    }
}