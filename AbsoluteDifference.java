import java.util.Arrays;

public class AbsoluteDifference {
    public static int[] getSumAbsoluteDifference(int[] nums){
        int[] out = new int[nums.length];

        for (int i=0; i<nums.length; i++){
            int sum = 0;
            for (int j=0; j<nums.length; j++){
                if (i > 0 && nums[i]==nums[i-1]){
                    sum = out[i-1];
                    break;
                }
                sum += Math.abs(nums[i] - nums[j]);
            }
            out[i] = sum;
        }
        return out;
    }
    public static void main(String[] args) {
        int[] nums = {3,8,8,8};
        System.out.println(Arrays.toString(getSumAbsoluteDifference(nums)));
    }
}
