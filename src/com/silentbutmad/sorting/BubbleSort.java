package com.silentbutmad.sorting;

import java.util.Arrays;

public class BubbleSort {
    static void sort(int arr[])
    {
        int i,j,temp;
        for(i=0;i< arr.length;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[]={10,50,30,458,59,59};
        System.out.println("Before sorting : "+Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }
}
