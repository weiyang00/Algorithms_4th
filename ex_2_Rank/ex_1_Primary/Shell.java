package ex_2_Rank.ex_1_Primary;

import StdLib.In;
import StdLib.StdIn;
import StdLib.StdOut;

public class Shell {
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3) {
			h = 3 * h + 1;
		}
		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
					exch(a, j, j - h);
				}
			}
			h = h / 3;
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
		System.out.println("input shell demo String : ");
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
