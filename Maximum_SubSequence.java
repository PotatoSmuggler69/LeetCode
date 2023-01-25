/*
 * KnapSack Bitch
*/
public class Maximum_SubSequence {
    public static void main(String[] args) {
        int[] arr = {-2,3,2,-9,10,-3};
        System.out.println(new Maximum_SubSequence().ways(arr, 0));
    }
    int ways(int[] arr,int index){
        if(index == arr.length) return 0;

        //Include
        int include = arr[index]+ways(arr,index+1);
        //Exclude
        int exclude = ways(arr,index+1);

        return Math.max(include,exclude);
    }
}
