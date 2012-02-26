package org.bk.algo003.sort.insertion;

public class InsertionSort {
	public static <T extends Comparable<? super T>> void sort(T[] a) {
		int numElements = a.length;
		for (int i = 1; i < numElements; i++) {
			for (int j=i;j>0 && isLess(a[j], a[j-1]);j--){
				exchange(a, j, j-1);
			}
		}
	}

	private static <T extends Comparable<? super T>> void exchange(T[] a, int i, int min) {
		T temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}
	
	private static <T extends Comparable<? super T>> boolean isLess(T a, T b){
		return a.compareTo(b) < 0;
	}

}