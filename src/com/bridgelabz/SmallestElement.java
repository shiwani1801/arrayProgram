package com.bridgelabz;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {2, 5, 10, 4};
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<minimum)
                minimum = arr[i];
        }
        System.out.println("Smallest element is :" + minimum);
    }
}
