package dev.vinisantosn.week1.day7;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;

/**
 * @author vinisantosn
 * TITLE:
 * Merge Sorted Array
 * TO DO:
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * NOTES:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 */
public class Day7 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        System.out.println(sortedArray(nums1, nums2));

    }

    private static String sortedArray(int[] array1, int[] array2) {
        int [] numsSorted = new int[array1.length+array2.length];
        for (int i = 0; i < array2.length; i++) {
            numsSorted[i] = array2[i];
        }
        int aux =0;
        for (int i = array2.length; i < array1.length; i++) {
            numsSorted[i]= array1[aux];
            aux++;
        }
        Arrays.sort(numsSorted);

        return Arrays.toString(numsSorted);

    }

}
