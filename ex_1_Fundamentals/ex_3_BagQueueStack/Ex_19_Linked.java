package ex_1_Fundamentals.ex_3_BagQueueStack;

public class Ex_19_Linked {
    private Node first ;
    private Node last ;
    private int N;

    Ex_19_Linked(){

    }

    public  void addLast(String s){
       Node oldLast = last;
       last = new Node();
       last.item = s;
       oldLast.next = last;
       N++;
    }

    public  void addFirst(String s){
        if (N == 0) {
            first.item = s;
            last = first;
        }
        Node oldFirst = first;
        first = new Node();
        first.item = s;
        first.next = oldFirst;
        N++;
    }


    public  void deleteEnd(){

    }

    public void delete(int k){
        int i = 0;
        for (Node x=first ; x != null; x = x.next){
            i++;
            if (i == k-1){
                x.next = x.next.next;
            }
        }

    }

    public boolean find(Ex_19_Linked linked, String key){
        for (Node x=linked.first ; x != null; x = x.next)
            if ( key.equals(x.item))
                return true;
        return false;
    }





}
