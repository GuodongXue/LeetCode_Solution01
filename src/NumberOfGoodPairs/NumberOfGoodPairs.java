package NumberOfGoodPairs;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums){
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[j]==nums[i] && j>i){
                    sum++;
                }
            }
        }
        return sum;
    }
}
