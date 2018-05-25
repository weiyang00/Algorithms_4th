package ex_2_Rank.ex_1_Primary;



import StdLib.In;
import StdLib.StdDraw;
import StdLib.StdIn;
import StdLib.StdOut;

import java.awt.*;

public class Insertion {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
				Example.exch(a, j, j - 1);
			}
		}
	}

	/**
	 * Exercise 2.1.18
	 * 
	 * @param a
	 */
	public static void drawSort(Comparable[] a) {
		int N = a.length;
		StdDraw.setYscale(N + 3, 0);
		StdDraw.setXscale(0, N + 3);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(3 + N / 2, 0.4, "a[ ]");
		StdDraw.text(1, 1, "i");
		StdDraw.text(2, 1, "j");
		for (int i = 0; i < N; i++) {
			StdDraw.text(3 + i, 1, i + "");
			StdDraw.text(3 + i, 2, a[i].toString());
		}
		StdDraw.line(0, 1.5, N + 3, 1.5);
		for (int i = 1; i < N; i++) {
			StdDraw.text(1, 2 + i, i + "");
			int red = i;
			for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
				Example.exch(a, j, j - 1);
				red = j - 1;
				StdDraw.text(3 + j, 2 + i, a[j].toString());
			}
			StdDraw.text(2, 2 + i, red + "");
			StdDraw.setPenColor(Color.RED);
			StdDraw.text(3 + red, 2 + i, a[red].toString());
			StdDraw.setPenColor(Color.GRAY);
			for (int k = 0; k < N; k++) {
				if (k < red || k > i) {
					StdDraw.text(3 + k, 2 + i, a[k].toString());
				}
			}
			StdDraw.setPenColor(Color.BLACK);
		}
		for (int i = 0; i < N; i++) {
			StdDraw.text(3 + i, N + 2, a[i].toString());
		}
	}


	public static void main(String[] args) {
		System.out.println("input insertion demo String : ");
		System.out.println("1,3,4,5,9,8,7,6,5,0,2");
		System.out.println("Correct result : 0 1 2 3 4 5 5 6 7 8 9");
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			String[] a = s.split(",");
			sort(a);
			assert Example.isSorted(a);
			Example.show(a);
		}
	}
}
