package com.company;

/**
 * Created by jjhu on 2014/12/4.
 */
public class ZigzagConversion {
    public static String convert(String s, int nRows) {
        /*if (s != null && s.length() > 0){
            char []chars = s.toCharArray();
            int maxLevel = chars.length > nRows ? nRows:chars.length;//s长度小于nrows层次
            StringBuffer levelStr = new StringBuffer();

            for (int i = 0, j = 0; i < maxLevel; i++){//一层一层添加字符
                int temp = i;//每层字符下标
                int []interval = new int[2];//奇偶每层间隔，interval[0]奇偶通用，interval[1]偶数专用
                if (i == (nRows-1)/2){//需要特殊处理的层
                    interval[0] = nRows/2 + 1;
                    interval[1] = nRows/2;
                }else {
                    interval[0] = nRows + 1;
                    interval[1] = nRows + 1;
                }

                while (temp < chars.length){
                    levelStr.append(chars[temp]);
                   if (nRows % 2 != 0){
                       temp += interval[0];
                   }else {
                       temp += interval[(j++) % 2];//偶数层需要特殊处理，偶数层的特殊层更特殊
                   }
                }
            }
            return levelStr.toString();
        }else if (s != null){
            return s;
        }else {
            return null;
        }*/
        if (s != null && s.length() > 0){
            if (s.length() < nRows || nRows == 1)
                return s;
            char []chars = s.toCharArray();
            char [][]table = new char[nRows][20];
            int temp = 0;
            for(int j = 0; j < 20 && temp < chars.length; j++){
                for(int i = 0; i < nRows && temp < chars.length; i++){
                    if (j == 0){//第一列特殊情况
                        table[i][j] = chars[temp++];
                        continue;
                    }
                    if (j % 2 == 1){
                        table[(nRows-1)/2][j] = chars[temp++];
                        break;
                    }else {
                        if((nRows-1)/2 == 0 && i == 0){//层数为2时特殊情况
                            continue;
                        }else {
                            table[i][j] = chars[temp++];
                        }
                    }
                }
            }

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < nRows; ++i)
                for (int j = 0; j < 20; ++j)
                    if (table[i][j] != '\u0000')
                        str.append(table[i][j]);
            return str.toString();
        }else {
            return s;
        }

    }

    public static void main(String[] args) {
        System.out.println(convert("ABCDEF",2));
    }
}
