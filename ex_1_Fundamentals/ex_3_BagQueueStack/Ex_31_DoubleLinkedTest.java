package ex_1_Fundamentals.ex_3_BagQueueStack;

public class Ex_31_DoubleLinkedTest {

    static DoubleNode first;
    static DoubleNode last;
    static int N = 0;


    public static void addInFirst(DoubleNode n){
        if (first.next == null && first.prior == null)
            first = last = n;
        else{
            first.prior = n;
            n.next = first;
            first = n;
        }
        N++;
    }

    public static void addInLast(DoubleNode n){
        if (first == null){
            last = first = n;

        }else if (first.next == null && first.prior == null){
            first.next = n;
            n.prior=first;
            last = n;
        } else {
            n.prior = last;
            last.next = n;
            last = n;
        }
        N++;
    }

    public static void delInFirst(){
        if (N == 1)
            first = last = null;
        else {
            first = first.next;
            first.prior = null;
        }
        N--;
    }

    public static void delInEnd(){
        if (N == 1)
            first = last = null;
        else {
            last = last.prior;
            last.next = null;
        }
        N--;
    }

    public static void insertBefore(DoubleNode key,String n){
        DoubleNode<String> newD = new DoubleNode<>();
        if (N == 1 ) {
            newD.next = key;
            key.prior = newD;
            first = newD;
            last = key;
        }else {
            newD.item = n;
            newD.next = key;
            newD.prior = key.prior;
            newD.prior.next = newD;
            key.prior = newD;
        }
        N++;
    }

    public static void insertAfter(DoubleNode key,String n){
        DoubleNode<String> newD = new DoubleNode<>();
        if (N == 1 ) {
            newD.prior = key;
            key.next = newD;
            first = newD;
            last = key;
        }else {
            newD.prior = key;
            newD.next = key.next;
            key.next.prior = newD;
            key.next = newD;
        }
        N++;
    }

    public static void del(DoubleNode key){
        if (N == 1 && first == key){
            first = null;
        }else if (N == 2) {
            if (key.prior == null){
                key.next.prior = null;
                key = null;
            }else if (key.next == null) {
                key.prior.next = null;
                key = null;
            }
        }else if (N > 2){
            DoubleNode prior = key.prior;
            DoubleNode next = key.next;

            prior.next = next;
            next.prior = prior;
            key = null;
            N--;
        }
        N--;
    }

}
