import java.util.Arrays;

public class NinjaTraing7 {


    public static int bestChoice(int day,int[][] nums,int task,int[][] dp){

        if(day == 0){
            int max =0;
            for(int i =0;i<3;i++){
                if(i!=task) max=Math.max(max,nums[0][i]);
            }
            return max;
        }

        if(dp[day][task] != -1)  return dp[day][task];
        
        int max = 0;
        
        for(int i =0;i<3;i++){
            int points=0;
            if(task!=i)  points = nums[day][i] +bestChoice(day-1, nums, i,dp);

            max=Math.max(max,points);
            dp[day][task]=max;
        }
        return max;
    }



    public static int bestChoiceTabulation(int[][] nums){

       int n =nums.length;

       int[][]  dp = new int[n][4];

       dp[0][0]= Math.max(nums[0][1],nums[0][2]);
       dp[0][1]= Math.max(nums[0][0],nums[0][2]);
       dp[0][2]= Math.max(nums[0][0],nums[0][1]);
       dp[0][3]= Math.max(nums[0][0],Math.max(nums[0][1],nums[0][2]));

       for(int day=1;day<n;day++){

        for(int last=0;last<4;last++){

            dp[day][last] =0;
            int max =0;

            for(int task =0;task<3;task++){
            int points=0;
            if(task!=last)  points = nums[day][task] + dp[day-1][task];

            max=Math.max(max,points);
            dp[day][last]=max;
        }
       


        }
       }
        return dp[n-1][3];
    }


     public static int bestChoiceTabulationS(int[][] nums){

       int n =nums.length;

       int[]  prev = new int[4];

       prev[0]= Math.max(nums[0][1],nums[0][2]);
       prev[1]= Math.max(nums[0][0],nums[0][2]);
       prev[2]= Math.max(nums[0][0],nums[0][1]);
       prev[3]= Math.max(nums[0][0],Math.max(nums[0][1],nums[0][2]));

       for(int day=1;day<n;day++){

        int[]  temp = new int[4];

        for(int last=0;last<4;last++){

            temp[last] =0;
            int max =0;

            for(int task =0;task<3;task++){
            int points=0;
            if(task!=last)  points = nums[day][task] + prev[task];

            max=Math.max(max,points);
            temp[last]=max;
        }
       
        }
       prev =temp;

       }
        return prev[3];
    }


    public static void main(String[] args) {
        
        int[][] points ={
            {1,2,4},
            {1,33,100},
            {25,75,99},{1,999,700},
        };

        int n =points.length-1;
        int[][] dp = new int[n+1][4];

        for(int[] row : dp){
    Arrays.fill(row, -1);
}
       System.out.println(bestChoice(n,points,3,dp));
       System.out.println(bestChoiceTabulation(points));
       System.out.println(bestChoiceTabulationS(points));
    }
    
}
