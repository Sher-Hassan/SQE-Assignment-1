package com.sqe.search;

public class JumpSearch {

    public int search(int[] arr, int key) {

        if (arr == null || arr.length == 0)
            return -1;

        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < key) {

            prev = step;
            step += (int) Math.sqrt(n);

            if (prev >= n)
                return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {

            if (arr[i] == key)
                return i;
        }

        return -1;
    }
}