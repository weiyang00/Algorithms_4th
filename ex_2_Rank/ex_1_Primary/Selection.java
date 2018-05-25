package ex_2_Rank.ex_1_Primary;



import StdLib.In;
import StdLib.StdDraw;
import StdLib.StdIn;
import StdLib.StdOut;

import java.awt.*;



public class Selection {
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (Example.less(a[j], a[min])) {
					min = j;
				}
			}
			Example.exch(a, i, min);
		}
	}


	/**
	 * Exercise 2.1.18
	 * 
	 * @param a
	 */
	public static void drawSort(Comparable[] a) {
		int N = a.length;
		StdDraw.setYscale(N + 4, 0);
		StdDraw.setXscale(0, N + 3);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(3 + N / 2, 0.4, "a[ ]");
		StdDraw.textRight(1, 1, "i");
		StdDraw.textRight(2, 1, "min");
		for (int i = 0; i < N; i++) {
			StdDraw.text(3 + i, 1, i + "");
			StdDraw.text(3 + i, 2, a[i].toString());
		}
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (Example.less(a[j], a[min])) {
					min = j;
				}
			}
			StdDraw.textRight(1, 3 + i, i + "");
			StdDraw.textRight(2, 3 + i, min + "");
			StdDraw.setPenColor(Color.GRAY);
			for (int j = 0; j < N; j++) {
				if (j == i) {
					StdDraw.setPenColor(Color.BLACK);
				}
				if (j == min) {
					StdDraw.setPenColor(Color.RED);
				}
				StdDraw.text(3 + j, 3 + i, a[j].toString());
				if (j == min) {
					StdDraw.setPenColor(Color.BLACK);
				}
			}
			Example.exch(a, i, min);
		}
		for (int i = 0; i < N; i++) {
			StdDraw.text(3 + i, N + 3, a[i].toString());
		}
	}


	public static void main(String[] args) {
		System.out.println("input selection demo String : ");
		System.out.println("1,3,4,5,9,8,7,6,5,0,2");
		System.out.println("Correct result : 0 1 2 3 4 5 5 6 7 8 9");
		while (!StdIn.isEmpty()){
			String s = StdIn.readString();
			String[] a = s.split(",");
			sort(a);
			assert Example.isSorted(a);
			Example.show(a);
		}
	}
}
