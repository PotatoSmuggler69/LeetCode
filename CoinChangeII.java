import java.util.Arrays;

public class CoinChangeII {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int target =10;
        int[][] dp = new int[arr.length][target+1];
        Arrays.stream(dp).forEach(i -> Arrays.fill(i, -1));
        Arrays.stream(dp).forEach(i -> System.out.println(Arrays.toString(i)));
        System.out.println(new CoinChangeII().ways(arr, target, 0,dp));
        Arrays.stream(dp).forEach(i -> System.out.println(Arrays.toString(i)));
    }
    int ways(int[] arr,int target,int index,int[][] dp){
        if(target == 0 ) return 1;

        if(index == arr.length || target<0 ) return 0;

        if(dp[index][target]!=-1) return dp[index][target];
        //include
        int include = ways(arr, target-arr[index], index,dp);
        //exclude
        int exclude = ways(arr, target, index+1,dp);

        return dp[index][target] = include + exclude;

    }
}
