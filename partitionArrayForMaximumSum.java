//Time complexity O(n)
//Space complexity O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        
        if(arr.length == 0){
            
            return -1;
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for(int i = 1; i < dp.length; i ++){
            
          int max = arr[i];
            
            for(int j = 1; j <=k && i - j + 1 >= 0; j++){//j is the size of partition
                
                max = Math.max(max , arr[i-j+1]);
                if(i - j >= 0){
                    
                    dp[i] = Math.max(dp[i],max * j + dp[i-j]);
                }
                else{
                    
                    dp[i] = Math.max(dp[i],max * j);
                }
                
                 
            }
               
            
            
        }
        return dp[arr.length-1];
    }
}