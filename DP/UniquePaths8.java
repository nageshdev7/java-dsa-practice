import java.util.*;
public class UniquePaths8 {

    public static int uniquePathsRecursion(int m, int n) {
        // basic Recursion Solution
        
        if(m==0 && n==0) return 1;

        if(m<0 ||n<0) return 0;


        int up =uniquePathsRecursion(m-1,n);
        int left =uniquePathsRecursion(m,n-1);

        return up+left;

    }
   
    public static int uniquePaths(int m, int n,int[][] dp) {
        // memoization solution
        
        if(m==0 && n==0) return 1;

        if(m<0||n<0) return 0;

        if(dp[m][n]!=-1) return dp[m][n];


        int up =uniquePaths(m-1,n,dp);
        int left =uniquePaths(m,n-1,dp);

        dp[m][n] =up+left;

        return up+left;

    }

      public  static int uniquePathsTabulation(int m, int n) {

        int dp[][] =new int[m][n];
        
       for(int i =0;i<m;i++){

        for(int j=0;j<n;j++){
                   
                   if(i==0 && j==0) dp[0][0]=1;
            else{

            int up =0;
            int left=0;

            if(i>0) up=dp[i-1][j];
            if(j>0) left=dp[i][j-1];

            dp[i][j]=up+left;
            }
        }
       }
       return dp[m-1][n-1];
    }

      

    public static int uniquePathsSpaceOptimization(int m, int n) {

        int dp[] =new int[n];
        
       for(int i =0;i<m;i++){
          
          int temp[] =new int[n];
        for(int j=0;j<n;j++){

                   
                   if(i==0 && j==0) temp[0]=1;
            else{
              
              if(j>0) temp[j]=dp[j]+temp[j-1];
              else temp[j]=dp[j];
            }
        }
        dp=temp;
       }
       return dp[n-1];
    }

    public static void main(String[] args) {

        int i =3;
        int j=7;

        System.out.println(uniquePathsRecursion(i-1,j-1));

        int dp[][] =new int[i][j];

       for(int[] arr :dp){
        Arrays.fill(arr,-1);
       }

        System.out.println(uniquePaths(i-1,j-1,dp));
        System.out.println(uniquePathsTabulation(i,j));
        System.out.println(uniquePathsSpaceOptimization(i,j));

        
    }
    
}
