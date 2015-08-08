package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MrHu on 2015/8/2.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        Map<Character, Integer> res = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if (res.containsKey(tmp)){
                res.put(tmp, res.get(tmp) + 1);
            }else {
                res.put(tmp, 1);
            }
        }

        for (int i = 0; i < t.length(); i++){
            char tmp = t.charAt(i);
            if (res.containsKey(tmp)){
                if (res.get(tmp) <= 0){
                    return false;
                }
                res.put(tmp, res.get(tmp) - 1);
            }else {
                return false;
            }
        }
        return true;
    }
}
