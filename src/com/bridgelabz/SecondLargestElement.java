package com.bridgelabz;

public class SecondLargestElement {
    public static void main(String[] args) {
        int temp;
        int arr[] ={10,20,60,30,50};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("Second largest no. is:"+arr[arr.length-2]);
    }
}
