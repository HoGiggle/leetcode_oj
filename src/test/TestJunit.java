package test;

import junit.framework.TestCase;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jjhu on 2014/12/29.
 */
public class TestJunit extends TestCase{
    public void testString(){
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        l1.add(3);
        l1.add(1);
        l1.add(2);

        l2.add(1);
        l2.add(2);
        l2.add(3);

        Set<List<Integer>> set = new HashSet<List<Integer>>();
        set.add(l1);
        set.add(l2);
        if (l1 == l2)
            System.out.println("==");
        if (l1.equals(l2))
            System.out.println("equals");

        System.out.println(set.size());
    }

    public void testSum(){
        String []num = {"12", "121", "3", "4", "45", "123"};
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        };

        Arrays.sort(num, comp);
        for (int i = 0; i < num.length; i++)
            System.out.println(num[i]);
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++)
            System.out.println(num[i]);
        Map<Integer, String> map = new HashMap();
        Set<Map.Entry<Integer, String>> entry = map.entrySet();
    }

    public void testCompare(){
        StringBuffer sf = new StringBuffer();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            sf.append(i);
        }
        long e1 = System.currentTimeMillis();
        System.out.println("StringBuffer:" + (e1 - s1));

        StringBuilder sb = new StringBuilder();
        long s2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            sb.append(i);
        }
        long e2 = System.currentTimeMillis();
        System.out.println("StringBuilder:" + (e2 - s2));

        String s = "";
        long s3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            s += i;
        }
        long e3 = System.currentTimeMillis();
        System.out.println("+++++:" + (e3 - s3));
    }

    public void testLogn(){
        int n = 11;
        int m = ~n;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
    }
}
