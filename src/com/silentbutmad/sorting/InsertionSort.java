package com.silentbutmad.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int arr[])
    {
        //swapping value if previous element is greater
        int i,end,temp;
        for(i=1;i<arr.length;i++)
        {
           end=i;
           while(end>0 && arr[end-1]>arr[end])
           {
               temp=arr[end-1];
               arr[end-1]=arr[end];
               arr[end]=temp;
               end--;
           }
        }

    }
    public static void sort1(int arr[])
    {
        // save element value in temp and check previous element is greater if true then assign the value of previous
        // element to current element then in last assign temp value
        int i,end,temp;
        for(i=1;i<arr.length;i++)
        {
            temp=arr[i];
            end=i-1;
            while(end>=0 && arr[end]>temp)
            {
                arr[end+1]=arr[end];
                end--;
            }
            arr[end+1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1000,50,30,458,59,59};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        sort1(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }
}
