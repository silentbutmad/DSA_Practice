package com.silentbutmad.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(){

    }
    public static void sort(int []arr,int len)
    {
        //divide array in single element


        //base condition
        if(len<2)
        {
            return;
        }

        //create new divide array
        int mid=len/2;
        int [] right=new int[mid];
        int [] left=new int[len-mid];

        //assign new array
        for(int i=0;i<mid;i++){
            right[i]=arr[i];
        }
        for(int i=mid;i<len;i++)
        {
            left[i-mid]=arr[i];
        }

        //recursive call for next separation
        sort(right,right.length);
        sort(left,left.length);

        //sort element and merge element




    }

    public static void main(String[] args) {
        int[] arr = {1000, 50, 30, 458, 59, 59};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        sort(arr, arr.length);
        System.out.println("After sorting  : " + Arrays.toString(arr));
    }
}

