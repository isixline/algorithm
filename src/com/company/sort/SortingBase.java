package com.company.sort;

import java.util.Random;

public class SortingBase {
    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    protected static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    protected static void showResult(Comparable[] a) {
        System.out.println("sort is " + isSorted(a));
        show(a);
    }

    protected static Comparable[] prepareData() {
        Random random = new Random();
        int length = random.nextInt(100);

        Integer[] a = new Integer[length];

        for (int i = 0; i < length; i++) {
            a[i] = random.nextInt(500);
        }

        return a;
    }
}
