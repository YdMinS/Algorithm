package com.ydmins.mathematics;

import java.util.Arrays;

public class nPr_permutation {

    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        permute(arr, 0);
    }

    // 가장 기본적인 순열 구하는 재귀적 방법
    private static void permute(int[] arr, int start){
        if(start == arr.length-1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=start; i<arr.length; i++){
            swap(arr, start, i);
            permute(arr, start+1);
            swap(arr, start, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
