package ex_2_Rank.ex_4_PriorityQueues;

import StdLib.MinPQ;
import StdLib.StdIn;
import StdLib.StdOut;
import ex_1_Fundamentals.ex_3_BagQueueStack.Stack;
import ex_2_Rank.ex_1_Primary.Transaction;


public class TopM {
	public static void main(String[] args) {
//		int M = Integer.parseInt(args[0]);
//		MinPQ<Transaction> pq = new MinPQ<Transaction>(M + 1);
//		while (StdIn.hasNextLine()) {
//			pq.insert(new Transaction(StdIn.readLine()));
//			if (pq.size() > M) {
//				pq.delMin();
//			}
//		}
//		Stack<Transaction> stack = new Stack<Transaction>();
//		while (!pq.isEmpty()) {
//			stack.push(pq.delMin());
//		}
//		for (Transaction t : stack) {
//			StdOut.println(t);
//		}
		long time1 = System.currentTimeMillis();

		String a = "";
		for (int i = 1; i<10000; i++){
			a += "this is a + " + new MaxPriorityQueues<>(0).isEmpty();
		}
		long time2 = System.currentTimeMillis();

		System.out.println("time = " + (time2 - time1) );
		System.out.println(a);

		long time3 = System.currentTimeMillis();
		StringBuilder b = new StringBuilder();
		for (int i = 1; i<10000; i++){
			b.append("this is b + " + new MaxPriorityQueues<>(0).isEmpty()) ;
		}
		System.out.println(b);
		long time4 = System.currentTimeMillis();
		System.out.println("time = " + (time4 - time3) );



	}
}
