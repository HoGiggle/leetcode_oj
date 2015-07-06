package intel.bigdata.com;

/**
 * Created by root on 6/6/15.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int []a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for (int i = 2; i < n; i++){
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n - 1];
    }
}
