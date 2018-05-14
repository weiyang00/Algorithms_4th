package ex_1_Fundamentals.ex_3_BagQueueStack;

public class Ex_33_ResizingArrayDeque<Item> {

    private Item[] a;

    int N;


    public Ex_33_ResizingArrayDeque(){
        N = 0;
        a = (Item[]) new Object[1];
    }

    public void resize(int max){
        Item[] items =  (Item[]) new Object[max];
        for (int i = 0; i < N; i++){
            items[i] = a[i];
            a = items;
        }
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public  int  size(){
        return N;
    }

    public void pushLeft(Item item){
        if (N == a.length){
            resize(2*N);
        }
        Item[] items =  (Item[]) new Object[2*N];
        items[0] = item;
        for (int i = 1; i < a.length; i++){
            items[i] = a[++i];
        }
        a = items;
        N++;
    }

    public void pushRight(Item item){
        if (N == a.length){
            resize(2*N);
        }
        a[N++] = item;
    }


    public Item  popLeft(){
        Item res = a[0];

        Item[] items =  (Item[]) new Object[a.length];
        for (int i = 0; i < a.length; i++){
            items[i] = a[++i];
        }
        a = items;

        if (--N > 0 && 4*N <= a.length)
            resize(a.length/2);
        return res;
    }

    public Item popRight(){
        Item res = a[--N];
        a[N] = null;
        if (N > 0 && 4*N <= a.length)
            resize(a.length/2);
        return res;
    }

}
