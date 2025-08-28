package com.silentbutmad.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int arr[])
    {
        // find the smallest element index, then swap with arr[i]
        int i,j,temp,min;
        for(i=0;i< arr.length-1;i++)
        {
            min=i;
            for(j=i+1;j< arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                temp=arr[i];
                arr[i]=arr[min];
                arr[min] =temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,50,30,458,59,56,59};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }
}
