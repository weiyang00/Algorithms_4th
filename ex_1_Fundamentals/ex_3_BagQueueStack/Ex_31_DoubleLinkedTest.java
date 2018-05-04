package ex_1_Fundamentals.ex_3_BagQueueStack;

public class Ex_31_DoubleLinkedTest {

    static DoubleNode first;
    static int N = 0;


    public static void addInFirst(DoubleNode n){
        if (first.next == null)
            first = n;
        first.prior = n;
        n.next = first;
        first = n;
        N++;
    }

    public static void addInLast(DoubleNode n){
        for (DoubleNode x = first; ; x = first.next)
            if (x == null);


    }

    public static void delInFirst(){

    }

    public static void delInEnd(){

    }

    public static void insertBefore(DoubleNode key,DoubleNode n){

    }

    public static void insertAfter(DoubleNode key,DoubleNode n){

    }

    public static void del(DoubleNode n){

    }

}
