//package Leet_code;

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Three_sum
{
	public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        int target = 0;
        System.out.println(triplet(arr, target));
	}
    static int triplet(int[] arr,int target){
	    Arrays.sort(arr);
	    int checksum = 2000000000; 
	    for(int i=0;i<arr.length-2;i++){
	        int left = i + 1;
	        int right = arr.length-1;
	        
	        while(right>left){
	            int sum = arr[i] + arr[left] + arr[right];
	            if(Math.abs(target - sum)<Math.abs(target - checksum) ){
	                checksum = sum;
	            }
                if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    return sum;
                }
	            
	        }
	        
	    }
	    return checksum;
	}
	
}
