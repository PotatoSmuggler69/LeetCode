public class L53_Maximum_SubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new L53_Maximum_SubArray().ways(nums,0,-100000,-100000));
    }
    int ways(int[] nums,int index,int sum,int FinalSum){
        if(index==nums.length) return FinalSum;

        if(sum+nums[index]<nums[index]) return ways(nums,index+1,nums[index],Math.max(FinalSum,nums[index]));
        
        else return ways(nums,index+1,nums[index]+sum,Math.max(nums[index]+sum,FinalSum));
        
    }
}
