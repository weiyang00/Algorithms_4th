package ex_2_Rank.ex_2_Merge;


import StdLib.In;
import StdLib.StdIn;
import StdLib.StdOut;


/**
 * this program that implements the three improvements to merge sort that are described in the text:
 * 1. add a cutoff from small subarrays,
 * 2. test whether the array is already in order,
 * 3. avoid the copy by switching arguments in the recursive code.
 *
 * 该项目实现了三点改进：
 * 1. 加快小数组的排序速度：当数组长度小于 CUTOFF = 15 时，改用插入排序；
 * 2. 检查数组是否已经有序，
 * 3. 通过在递归中交换参数来避免数组的复制。
 */



public class Ex_11_OptimizedMerge {

	private static int CUTOFF = 15;

	public static void merge(Comparable[] src, Comparable[] dest, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				dest[k] = src[j++];
			} else if (j > hi) {
				dest[k] = src[i++];
			} else if (less(src[j], src[i])) {
				dest[k] = src[j++];
			} else {
				dest[k] = src[i++];
			}
		}
	}

	public static void sort(Comparable[] a) {
		Comparable[] aux = a.clone();
		sort(aux, a, 0, a.length - 1);
	}

	private static void sort(Comparable[] src, Comparable[] dest, int lo, int hi) {
		if (hi - lo < CUTOFF) {
			insertionSort(dest, lo, hi);
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(dest, src, lo, mid);
		sort(dest, src, mid + 1, hi);
		if (less(src[mid + 1], src[mid])) {
			merge(src, dest, lo, mid, hi);
		}
	}

	public static void insertionSort(Comparable[] a, int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
		}
		StdOut.println();
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			if (less(a[i], a[i - 1])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("input merge demo String : ");
		System.out.println("1,3,4,5,9,8,7,6,5,0,2");
		System.out.println("Correct result : 0 1 2 3 4 5 5 6 7 8 9");
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			String[] a = s.split(",");
			sort(a);
			assert isSorted(a);
			show(a);
		}
	}
}
