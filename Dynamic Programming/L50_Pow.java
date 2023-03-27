import java.util.*;
public class L50_Pow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        new L50_Pow().myPow(x, n);
        sc.close();
    }
    public double myPow(double x, int n) {
        return (n>0) ? pow(x,n) : 1/pow(x,n);
    }

    double pow(double x,int n){
        if(n==0) return 1;

        double ans = pow(x,n/2);

        if(n%2==0) return ans * ans;
        else return x * ans * ans;


    }
}