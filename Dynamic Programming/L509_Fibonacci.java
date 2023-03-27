import java.util.*;
public class L509_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        new L509_Fibonacci().solution(n, dp);
    }
    public int solution(int n,int[] dp){
        if(n==0 || n==1) return n;
        if(dp[n]!=-1) return dp[n];
        else return dp[n] = solution(n-1,dp) + solution(n-2,dp);
    }    
}
