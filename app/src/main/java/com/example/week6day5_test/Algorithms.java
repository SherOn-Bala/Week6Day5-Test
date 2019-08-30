package com.example.week6day5_test;

import static java.util.Arrays.sort;

public class Algorithms {

    /* 1. Write a method that takes an int array and a int target value as parameters. The int
     * Array will be a guaranteed to be a sorted array of unique  positive values. Have the method
     * find the index in the target value if it exist in the array. If not, return -1. Time
     * complexity allowed:  O(log n)
     *
     * Example:
     * Int[] array: {1,2,3,4,5,6,10,20,50}
     * Target: 20
     *
     * Return would equal 7.
     */
    public static int binarySearch(int[] arr, int target) {
        int
                start = 0,
                end = arr.length - 1,
                mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    /* 2. Write a method to calculate the value of n^m. The method MUST have a time complexity of
     * less than O( n ) ; m can be any int value (negative and positive)
     */
    public static long powerOf(long val, int pow) {
        long offset = 1;

        while (pow != 1) {
            if (pow % 2 == 1) {
                offset *= val;
            }

            pow /= 2;
            val *= val;
        }

        return offset * val;
    }

    /* 2. Write a method to calculate the value of n^m. The method MUST have a time complexity of
     * less than O( n ) ; m can be any int value (negative and positive)
     */
    public static int[] removeDuplicates(int[] arr) {
        int[] newArr = new int[]{arr[0]};
        int j = 1;

        for (int i = 1; i < arr.length; i++) {
            if (binarySearch(newArr, arr[i]) == -1) {
                if (j >= newArr.length) {
                    newArr = doubleArr(newArr);
                }

                newArr[j] = arr[i];
                sort(newArr);
                j++;
            }

        }

        return (j < newArr.length) ? resizeArr(newArr, j) : newArr;
    }

    private static int[] doubleArr(int[] arr) {
        return resizeArr(arr, arr.length * 2);
    }

    private static int[] resizeArr(int[] arr, int size) {
        int[] neWarr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            if (i == size) {
                break;
            }
            neWarr[i] = arr[i];
        }

        return neWarr;
    }

}
