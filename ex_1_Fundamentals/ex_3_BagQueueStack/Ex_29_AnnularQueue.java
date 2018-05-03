package ex_1_Fundamentals.ex_3_BagQueueStack;

public class Ex_29_AnnularQueue {
    private Node last ;
    private int N;

    public void enqueue(String string) {
        if (N == 0){
            last.item = string;
            last.next = last;
        }
        else {
            Node oldLast = last;
            last = new Node();
            last.item= string;
            last.next = oldLast.next;
            oldLast.next = last;
        }
    }

    public String dequeue() {
        String s = (String) last.next.item;
        last.next = last.next.next;
        return s;
    }


}
