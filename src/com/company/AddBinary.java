package com.company;


/**
 * Created by jjhu on 2015/4/28.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        /*int mlen = Math.max(a.length(), b.length()), alen = a.length() - 1, blen = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < mlen; i++){
            int rem;
            if (alen >= i && blen >= i){
                rem = ((a.charAt(alen - i) - '0') + (b.charAt(blen - i) - '0') + carry) % 2;
                carry = ((a.charAt(alen - i) - '0') + (b.charAt(blen - i) - '0') + carry) / 2;
            }else if(alen >= i){
                rem = ((a.charAt(alen - i) - '0') + carry) % 2;
                carry = ((a.charAt(alen - i) - '0') + carry) / 2;
            }else {
                rem = ((b.charAt(blen - i) - '0') + carry) % 2;
                carry = ((b.charAt(blen - i) - '0') + carry) / 2;
            }
            sb.insert(0, rem);
        }
        if (carry == 1) {
            sb.insert(0, 1);
            return sb.toString();
        }
        return sb.toString();*/

        int i = a.length()-1, j = b.length()-1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1){
            if (i >= 0){
                carry += a.charAt(i--) - '0';
            }
            if (j >= 0){
                carry += b.charAt(j--) - '0';
            }
            sb.insert(0, carry % 2);
            carry /= 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AddBinary ad = new AddBinary();
        System.out.println(ad.addBinary("111", "11"));
    }
}
