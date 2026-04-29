
//optimal in O(N) pass
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;

        Map <Integer,Integer>  map =new HashMap<Integer,Integer>();


        for(int i =0;i<n;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i],i);
           
        }

       
       
return new int[]{-1, -1};
        
    }
}



//brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;

        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(nums[i]+nums[j]==target){
                     return new int[]{i, j};
                }
            }
        }

       throw new IllegalArgumentException("No two sum solution");
        
    }
}
