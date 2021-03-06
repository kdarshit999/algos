package org.bk.algo.sort.algo05.quick;



public class QuickSort {
    public static <T extends Comparable<? super T>> void sort(T[] a) {
        quicksort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> void quicksort(T[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        quicksort(a, lo, j - 1);
        quicksort(a, j + 1, hi);
    }

    private static <T extends Comparable<? super T>> int partition(T[] a, int lo, int hi){
    	int i=lo;
    	int j=hi+1;
    	T partitionItem = a[lo];
    	while(true){
    		while (isLess(a[++i], partitionItem)) if (i==hi) break;
    		while (isLess(partitionItem, a[--j]))  if (j==lo) break;
    		if (i>=j) break;
    		exchange(a, i, j);
    	}
    	exchange(a, j, lo);
    	return j;
    	
    }


    private static <T extends Comparable<? super T>> void exchange(T[] a, int i, int min) {
        T temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    private static <T extends Comparable<? super T>> boolean isLess(T a, T b) {
        return a.compareTo(b) < 0;
    }

}