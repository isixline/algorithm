package com.company.sort;

public class Quick3Way extends SortingBase {
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int low, int hig) {
       if (hig <= low) return;

       int lt = low;
       int i = low + 1;
       int gt = hig;

       Comparable v = a[low];

       while (i <= gt) {
           int cmp = a[i].compareTo(v);

           if (cmp < 0) swap(a, lt++, i++);
           else if (cmp > 0) swap(a, i, gt--);
           else i++;
       }

       sort(a, low, lt - 1);
       sort(a, gt + 1, hig);
    }

    public static void main(String[] args) {
        Comparable[] a = prepareData();
        show(a);
        sort(a);
        showResult(a);
    }
}
