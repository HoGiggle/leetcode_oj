package intel.bigdata.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 6/5/15.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null)
            return 0;

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val)
                list.add(nums[i]);
        }
        for (int j = 0; j < list.size(); j++){
            nums[j] = list.get(j);
        }
        return list.size();

        /*int i = 0, j = 0, n = nums.length;
        while (j<n) {
            if (nums[j]!=val) {
                nums[i] = nums[j];
                ++i;
            }
            ++j;
        }
        return i;*/
    }
}
