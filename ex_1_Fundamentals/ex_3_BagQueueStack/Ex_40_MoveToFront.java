package ex_1_Fundamentals.ex_3_BagQueueStack;

import StdLib.StdIn;

import java.util.Iterator;

/**
 * Created by weiyang on 2018/5/17.
 *
 * @author weiyang
 * @Title: Please fill file name here
 * @Package
 * @Description: Please fill description of the file here
 * @date 2018/5/17
 */
public class Ex_40_MoveToFront<Item> implements Iterable {

    private Node<Item> first;

    private int N;

    Ex_40_MoveToFront(Item[] items){
        for (Item item: items){
            dequeue(item);
            enqueue(item);
        }
    }


    //从first添加一个元素
    public void enqueue(Item item){
        if (N == 0){
            first = new Node<>();
            first.item = item;
            first.next = null;
        }
        if (N > 0) {
         Node<Item> priorNode = new Node<>();
         priorNode.item = item;
         priorNode.next = first;
         first = priorNode;
        }
        N++;
    }

    //判断元素是否存在 若存在则删除它
    public void dequeue(Item item){

        if (N == 0){
            return;
        }
        if (N==1){
            if (first.item.equals(item) || first.item == item){
                first = null;
                N = 0;
            }
            return;
        }

        Node<Item> current = first;
        for (int i = 0; i< N-1; i++){
            if (first.item.equals(item) || first.item == item){
                first = first.next;
                current = null;
                N--;
                return;
            }

            if (current.next.item.equals(item) || current.next.item == item){
                current.next = current.next.next;
                N--;
                return;
            }
            current = current.next;
        }
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node<Item> current = first;

        public boolean hasNext(){
            return current!=null;
        }

        public void remove(){

        }

        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }



    public static void main(String[] args) {
        System.out.println("input demo ： aaabbcdefgghih" );
        while (!StdIn.isEmpty()) {
            String input = StdIn.readString();
            String[] inputs = input.split("");
            Ex_40_MoveToFront<String> moveToFront = new Ex_40_MoveToFront<String>(inputs);
            for (Object string: moveToFront){
                System.out.println("" + string);
            }

        }
    }



}
