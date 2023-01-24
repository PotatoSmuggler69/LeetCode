/*
 * Coin change using Knap Sack
 * 
*/

import java.util.*;
public class Coin_Change{
    public static void main(String[] args) {
        int arr[] = {2,3,5};
        int target = 10;
        System.out.println("fgfg");
        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);
        System.out.println(new Coin_Change().MinPath(arr, target,dp));
        

        
    }

    int MinPath(int[] arr,int target,int[] dp){
        
        //base case
        if(target==0) return 0;

        if(target<0 ) return Integer.MAX_VALUE;
        
        if(dp[target]!=-1) return dp[target];
        
        int ans = Integer.MAX_VALUE;
        for(int i: arr){
           int temp = MinPath(arr, target-i, dp);
           if(temp != Integer.MAX_VALUE) ans = Math.min(ans,temp+1);
        }
        
        return dp[target] = ans;
    }

}