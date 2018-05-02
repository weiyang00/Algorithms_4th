package ex_1_Fundamentals.ex_3_BagQueueStack;

import StdLib.StdIn;
import StdLib.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ex_14_ResizingArrayQueueOfStrings implements Iterable<String> {
    private String[] queue = new String[1];
    private int N = 0;
    public boolean isEmpty(){ return N==0;}
    public int size() {return N;}

    private void resize(int max) {
        String[] string = new String[max];
        for (int i = 0; i< N; i++)
            string[i] = queue[i];
        queue = string;
    }

    public void enqueue(String string) {
        if (N == queue.length)
            resize(2*queue.length);
            queue[N] = string;
            N++;
    }

    public String dequeue() {
        if (N-- <= queue.length/4)
            resize(queue.length/2);
        String[] st = new String[queue.length];
        String s = queue[0];
        for (int i = 1; i< queue.length; i++)
            st[i-1] = queue[i];
        queue = st;
        return s;
    }


    public Iterator<String> iterator()  {
        return new ListIterator();
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<String> {
        private int i = 0;

        public boolean hasNext()  { return !(i>= N);                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            String item = queue[i];
            i++;
            return item;
        }
    }


    public static void main(String[] args) {
        Ex_14_ResizingArrayQueueOfStrings queueOfStrings = new Ex_14_ResizingArrayQueueOfStrings();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (item.contains("-")){
                queueOfStrings.dequeue();
            }
            else if (!item.contains("-")){
                queueOfStrings.enqueue(item);
                queueOfStrings.dequeue();
                queueOfStrings.enqueue("1");
                queueOfStrings.enqueue("2");
                queueOfStrings.enqueue("2");
                queueOfStrings.enqueue("3");
                queueOfStrings.enqueue("4");
                queueOfStrings.enqueue("5");
                queueOfStrings.dequeue();

            }
            for (String s:queueOfStrings)
                System.out.println(s);
        }
    }

}
