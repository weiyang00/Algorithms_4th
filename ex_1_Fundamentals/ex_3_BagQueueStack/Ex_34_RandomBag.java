package ex_1_Fundamentals.ex_3_BagQueueStack;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by zouzhiyuan on 28/03/2018.
 *
 * @author weiyang
 * @Title: Please fill file name here
 * @Package
 * @Description: Please fill description of the file here
 * @date 2018/5/14
 */
public class Ex_34_RandomBag<Item> implements Iterable<String> {

    Item[] items;

    int N ;

    Ex_34_RandomBag(){
        items = (Item[]) new Object[0];
    }

    public void resize(int max){
        Item[] item =  (Item[]) new Object[max];
        for (int i = 0; i < N; i++){
            item[i] = items[i];
            items = item;
        }
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void add(Item item){
        if (N == items.length)
            resize(2*N);
        items[N++] = item;
    }


    public Iterator iterator()  {
        return new ListIterator();
    }

    private class ListIterator<Item> implements Iterator {

        ListIterator(){
            //随机均匀打乱数组
            ShuffleArray.shuffle(items);
        }
        private int i = 0;

        public boolean hasNext()  { return !(i>= N);}
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item a = (Item) items[i++];
            return a;
        }
    }





}
