package ex_1_Fundamentals.ex_3_BagQueueStack;

import StdLib.StdIn;
import StdLib.StdOut;

/**
 * Created by weiyang on 2018/5/17.
 *
 * @author weiyang
 * @Title: Please fill file name here
 * @Package
 * @Description: Please fill description of the file here
 * @date 2018/5/17
 */
public class Ex_37_Josephus {

    Node first;

    int N;

    Ex_37_Josephus(int N){
        if (N < 0){
            return;
        }
        first = new Node();
        first.item = 0;
        if (N == 1){
            first.next = first;
            return;
        }
        Node nextNode = new Node();
        Node priorNode = new Node();
        if (N >= 2){
            first.next = nextNode;
            nextNode.item = 1;
            nextNode.next = first;
            priorNode = nextNode;
        }
        for (int i=2; i< N ; i++){
            nextNode = new Node();
            nextNode.item = i;
            nextNode.next = first;
            priorNode.next = nextNode;
            priorNode = nextNode;
        }
        this.N = N;
    }


    //delete the element in M and return it
    public int del(int M){
        Node delPriorNode = first;
        if (M == 1){
            first = first.next;
            N--;
            return (int)delPriorNode.item;
        }
        for (int i = 1 ; i < M-1 ; i++){
            delPriorNode = delPriorNode.next;
        }

        int resItem = (int) delPriorNode.next.item;
        first = delPriorNode.next.next;
        delPriorNode.next = delPriorNode.next.next;
        this.N--;
        return  resItem;
    }


    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String input = StdIn.readString();
            String[] inputs = input.split(",");
            int N = Integer.parseInt(inputs[0]);
            int M = Integer.parseInt(inputs[1]);

            Ex_37_Josephus josephus = new Ex_37_Josephus(N);
            Node nextNode = josephus.first;
            System.out.println("第 "+0+" 个元素为 "+ 0);
            for (int i = 1; i< N; i++){
                nextNode = nextNode.next;
                System.out.println("第 "+i+" 个元素为 "+ nextNode.item );
            }

            System.out.println();
            System.out.println("人们被杀死的顺序为： " );
            while (josephus.N > 0 ){
                int res = josephus.del(M);
                System.out.println(res);
            }

        }
    }



}
