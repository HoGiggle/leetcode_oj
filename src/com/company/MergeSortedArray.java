package com.company;

/**
 * Created by jjhu on 2015/1/8.
 */
public class MergeSortedArray {
    public static void merge(int A[], int m, int B[], int n) {
        int []midArray = new int[A.length];
        int i = 0, j = 0;
        int len = 0;
        while (i < m && j < n){
            if (A[i] <= B[j])
                midArray[len++] = A[i++];
            else
                midArray[len++] = B[j++];
        }
        while (i < m) {
            midArray[len++] = A[i++];
        }
        while (j < n){
            midArray[len++] = B[j++];
        }

        i = 0;
        while (i < len){
            A[i] = midArray[i];
            ++i;
        }

        for (i = 0; i < len; i++)
            System.out.println(A[i]);
    }


    public static void main(String[] args) {
       /* int []A = new int[20];
        int []B = {2,4,6};
        A[0] = 1;
        A[1] = 3;
        A[2] = 5;
        A[3] = 7;
        A[4] = 9;

        merge(A,5,B,3);*/
        int []A = {1};
        int []B = {};
        merge(A,1,B,0);
    }
}
