package com.company;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jjhu on 2015/4/29.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
       /* if (s.length() != s.length()) return false;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '@'){
                String chrS = s.charAt(i) + "";
                String chrT = t.charAt(i) + "";
                while (s.contains(chrS) && t.contains(chrT)){
                    if (s.indexOf(chrS) == t.indexOf(chrT)){
                        s = s.replaceFirst(chrS, "@");
                        t = t.replaceFirst(chrT, "@");
                    }else {
                        return false;
                    }
                }

                if (s.contains(chrS) || t.contains(chrT)){
                    return false;
                }
            }
        }
        return true;*/

        if (s == null || t == null || s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i))
                return false;
            else if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i)))
                return false;

            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings i = new IsomorphicStrings();
        System.out.println(i.isIsomorphic("title", "paper"));
    }
}
