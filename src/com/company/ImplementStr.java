package intel.bigdata.com;

/**
 * Created by root on 6/6/15.
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length())
            return -1;

        char []full = haystack.toCharArray();
        char []part = needle.toCharArray();
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if (full[i] == part[0]){
                int j = 0;
                while (j < needle.length() && full[i+j] == part[j]){
                    j++;
                }

                if (j == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
