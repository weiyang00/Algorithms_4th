package ex_2_Rank.ex_4_PriorityQueues;

import StdLib.MinPQ;
import StdLib.StdIn;
import StdLib.StdOut;
import ex_1_Fundamentals.ex_3_BagQueueStack.Stack;
import ex_2_Rank.ex_1_Primary.Transaction;


public class TopM {
	public static void main(String[] args) {
		int M = Integer.parseInt(args[0]);
		MinPQ<Transaction> pq = new MinPQ<Transaction>(M + 1);
		while (StdIn.hasNextLine()) {
			pq.insert(new Transaction(StdIn.readLine()));
			if (pq.size() > M) {
				pq.delMin();
			}
		}
		Stack<Transaction> stack = new Stack<Transaction>();
		while (!pq.isEmpty()) {
			stack.push(pq.delMin());
		}
		for (Transaction t : stack) {
			StdOut.println(t);
		}
	}
}
