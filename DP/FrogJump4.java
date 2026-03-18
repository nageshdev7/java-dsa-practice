/*Frog Jump Problem (Classic DP)
A frog is standing at the first step (index 0) of a staircase with N steps.
Each step has a certain height given in an array heights[].
Rules:
The frog can jump:
either 1 step ahead, or
2 steps ahead
The energy cost of a jump from step i to step j is:
∣heights[i]−heights[j]∣
*/

import java.util.Arrays;

public class FrogJump4 {
    
    public static int frogjump(int n,int[] steps,int[] dp){
        //memoization
        if(n==0) return 0;

        if(dp[n] != -1) return dp[n];

        int right =frogjump(n-1, steps, dp)+Math.abs(steps[n]-steps[n-1]);
        int left =Integer.MAX_VALUE;
        if(n>1) left =frogjump(n-2, steps, dp)+Math.abs(steps[n]-steps[n-2]);

        dp[n] =Math.min(right,left);

        return dp[n];
    }

    public static int frogjumpT(int n,int[] steps,int[] dp){
        //memoization
        if(n==0) return 0;
        dp[0]=0;

       for(int i=1;i<=n;i++){

        int fs=dp[i-1]+Math.abs(steps[i]-steps[i-1]);
        int ss =Integer.MAX_VALUE;
        if(i>1)ss=dp[i-2]+Math.abs(steps[i]-steps[i-2]);
        dp[i]=Math.min(fs,ss);
       }
       

        return dp[n];
    }







    public static void main(String args[]){

        int[]  arr ={30,10,60,30,60,50,40};
        int n =arr.length-1;
        int[] dp =new int [arr.length];
        Arrays.fill(dp, -1);

       System.out.println( frogjump(n,arr,dp));
       Arrays.fill(dp, -1);
       System.out.println( frogjumpT(n,arr,dp));
    }
    
}
