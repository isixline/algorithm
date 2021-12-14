package com.company.sort;

public class Quick extends SortingBase {
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int low, int hig) {
        if (hig <= low) {
            return;
        }

        int j = partition(a, low, hig);

        sort(a, low, j - 1);
        sort(a, j + 1, hig);
    }

    private static int partition(Comparable[] a, int low, int hig) {
        int i = low;
        int j = hig + 1;

        Comparable v = a[low];

        while (true) {
            while (less(a[++i], v)) {
                if (i == hig) break;
            }

            while (less(v, a[--j])) {
                if (j == low) break;
            }

            if (i >= j) break;

            swap(a, i, j);
        }

        swap(a, low, j);

        return j;
    }

    public static void main(String[] args) {
        Comparable[] a = prepareData();
        show(a);
        sort(a);
        showResult(a);
    }
}
