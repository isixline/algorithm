package com.company.sort;

public class Example extends SortingBase {
    public static void sort(Comparable[] a) {

    }

    public static void main(String[] args) {
        Comparable[] a = prepareData();
        show(a);
        sort(a);
        showResult(a);
    }
}
