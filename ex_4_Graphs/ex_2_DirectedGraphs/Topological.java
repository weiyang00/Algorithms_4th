package ex_4_Graphs.ex_2_DirectedGraphs;


import StdLib.StdOut;

public class Topological {
	private Iterable<Integer> order;
	
	public Topological(Digraph G) {
		DirectedCycle cyclefinder = new DirectedCycle(G);
		if (!cyclefinder.hasCycle()) {
			DepthFirstOrder dfs = new DepthFirstOrder(G);
			order = dfs.reversePost();
		}
	}
	
	public Iterable<Integer> order() {
		return order;
	}
	
	public boolean isDAG() {
		return order != null;
	}

	public static void main(String[] args) {
//        String filename = args[0];
//		String separator = args[1];
        String filename = "D:/jobs.txt";
        String separator = "/";
        SymbolDigraph sg = new SymbolDigraph(filename, separator);
		
		Topological top = new Topological(sg.G());
		
		for (int v : top.order()) {
			StdOut.println(sg.name(v));
		}
	}
}
