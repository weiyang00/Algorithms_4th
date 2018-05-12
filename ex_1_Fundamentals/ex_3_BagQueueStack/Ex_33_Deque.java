package ex_1_Fundamentals.ex_3_BagQueueStack;

public class Ex_33_Deque<Item> implements Iterable<Item>{

    DoubleNode left;

    DoubleNode right;

    int N;

    public Ex_33_Deque(){
        N = 0;
        left = right = null;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public  int  size(){
        return N;
    }

    public void pushLeft(Item item){
        if (N == 0) {
            left.item = item;
        }
        if (N > 0) {
            DoubleNode newleft = new DoubleNode();
            newleft.item = item;
            newleft.next = left;
            left.prior = newleft;
            left = newleft;
        }
        N++;
    }

    public void pushRight(Item item){
        if (N == 0) {
            left.item = item;
        }
        if (N > 0) {
            DoubleNode newright = new DoubleNode();
            newright.item = item;
            right.next = newright;
            newright.prior = right;
            right = newright;
        }
        N++;
    }


    public Item  popLeft(){
        if (N == 0) {
            return null;
        }
        if (N == 1) {
            Item res = (Item)left.item;
            left = right = null;
            return res;
        }
        if (N > 1) {
            Item res = (Item)left.item;
            left = left.next;
            return res;
        }
        N--;
        return null;
    }

    public Item popRight(){
        if (N == 0) {
            return null;
        }
        if (N == 1) {
            Item res = (Item)left.item;
            left = right = null;
            return res;
        }
        if (N > 1) {
            Item res = (Item)right.item;
            right = right.prior;
            return res;
        }
        N--;
        return null;
    }

}
