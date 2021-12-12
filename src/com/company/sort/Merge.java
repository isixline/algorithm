package com.company.sort;

public class Merge extends SortingBase {

    private static Comparable[] aux;
    public static void sort(Comparable[] a) {
        int length = a.length;
        aux = new Comparable[length];
        sort(a, 0, length - 1);
    }

    public static void sort(Comparable[] a, int low, int hig) {
        if (hig <= low) return;

        int mid = (low + hig) / 2;

        sort(a, low, mid);
        sort(a, mid + 1, hig);

        merge(a, low, mid ,hig);
    }

    public static void merge(Comparable[] a, int low, int mid, int hig) {
        int i = low;
        int j = mid + 1;

        for (int k = low; k <= hig; k++) {
            aux[k] = a[k];
        }

        for (int k = low; k <= hig; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hig) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static void main(String[] args) {
        Comparable[] a = prepareData();
        show(a);
        sort(a);
        showResult(a);
    }
}
