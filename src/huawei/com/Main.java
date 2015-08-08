package huawei.com;

import java.util.Scanner;

/**
 * Created by MrHu on 2015/8/2.
 */
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char []inChar = in.toCharArray();
        int i = 0, j = inChar.length - 1;
        while (i < j){
            char tmp = inChar[i];
            inChar[i] = inChar[j];
            inChar[j] = tmp;
            i++;
            j--;
        }
        System.out.println(inChar);
    }
}*/

public class Main{
    public int getCommonStrLength(String firS, String secS){
        int [][]res = new int[firS.length() + 1][secS.length() + 1];
        char []fir = firS.toCharArray();
        char []sec = secS.toCharArray();

        for (int i = 0; i <= secS.length(); i++){
            res[0][i] = 0;
        }
        for (int i = 1; i <= firS.length(); i++){
            res[i][0] = 0;
        }

        int max = 0;
        for (int i = 1; i <= firS.length(); i++){
            for (int j = 1; j <= secS.length(); j++){
                if (fir[i - 1] == sec[j - 1]){
                    res[i][j] = res[i-1][j-1] + 1;
                    if (res[i][j] > max){
                        max = res[i][j];
                    }
                }else {
                    res[i][j] = 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String []fir = in.toLowerCase().split(" ");
        Main m = new Main();
        System.out.print(m.getCommonStrLength(fir[0], fir[1]));
    }
}
