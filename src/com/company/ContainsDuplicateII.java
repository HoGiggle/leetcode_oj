package intel.bigdata.com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 6/10/15.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || k <= 0) return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                int diff = Math.abs(i - map.get(nums[i]));
                if (diff <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
