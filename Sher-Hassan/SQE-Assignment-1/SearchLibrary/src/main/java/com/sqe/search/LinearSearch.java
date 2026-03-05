package com.sqe.search;

public class LinearSearch {

    public int search(int[] arr, int key) {

        if (arr == null)
            return -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key)
                return i;
        }

        return -1;
    }
}