package Leet_code;
import java.util.*;

public class House_robber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(rob(arr));
    }
    public static int rob(int[] arr){
        int n1=arr[0],n2=arr[1];
        for(int i=2;i<arr.length;i++){
            int temp = Math.max(n1+arr[i],n2);
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }
}