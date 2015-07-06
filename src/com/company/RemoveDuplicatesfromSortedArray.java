package intel.bigdata.com;

/**
 * Created by root on 6/9/15.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        int value = Integer.MIN_VALUE;
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != value){
                nums[i++] = nums[j];
                value = nums[j];
            }
        }
        return i;
    }
}
