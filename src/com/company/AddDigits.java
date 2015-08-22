package com.company;

/**
 * Created by MrHu on 2015/8/16.
 */
public class AddDigits {
    public int addDigits(int num) {
        while (num > 9){
            int sum = 0;
            while (num != 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        AddDigits a = new AddDigits();
        System.out.println(a.addDigits(281));
    }
}
