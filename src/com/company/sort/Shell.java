package com.company.sort;

public class Shell extends SortingBase {
    public static void sort(Comparable[] a) {
        int length = a.length;

        int h = 1;

        while (h < length / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j--) {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }

    }

    public static void main(String[] args) {
        Comparable[] a = prepareData();
        show(a);
        sort(a);
        showResult(a);
    }
}
