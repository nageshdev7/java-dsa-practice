import java.util.ArrayList;

public class circularHouseRob6 {

    public int rob(int[] nums) {

        int n =nums.length;

        if(n==1) return nums[0];

        ArrayList<Integer> temp1 =new ArrayList<>();
        ArrayList<Integer> temp2 =new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(i!=0) temp1.add(nums[i]);
            if(i!=n-1) temp2.add(nums[i]);
        }

        return Math.max(Maxi(temp1),Maxi(temp2));
    }
    public int Maxi(ArrayList<Integer> nums){

        int n =nums.size();
        if(n==1) return nums.get(0);
        int prev = Math.max(nums.get(0),nums.get(1));
        int prevLast =nums.get(0);
       
       for(int i=2;i<n;i++){
    
    int pick = nums.get(i) + prevLast;
            int notPick = prev;

            int current = Math.max(pick, notPick);

            prevLast = prev;
            prev = current;
       }

return prev;

    }
}
