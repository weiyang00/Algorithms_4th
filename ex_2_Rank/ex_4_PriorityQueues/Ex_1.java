package ex_2_Rank.ex_4_PriorityQueues;

import StdLib.StdIn;

/**
 * Created by weiyang on 2018/6/4.
 *
 * @Author: weiyang
 * @Package ex_2_Rank.ex_4_PriorityQueues
 * @Project: Algorithms_4th
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/6/4 10:58
 */
public class Ex_1 {

    public static void main(String[] args) {
        System.out.println("sample String : ");
        System.out.println("P,R,I,O,*,R,*,*,I,*,T,*,Y,*,*,*,Q,U,E,*,*,*,U,*,E");

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            String[] a = s.split(",");
            MaxPriorityQueues maxPriorityQueues = new MaxPriorityQueues(a.length);
            for (String st : a){
                if (st.equals("*")){
                    System.out.print(maxPriorityQueues.delMax()+ " ");
                } else {
                    maxPriorityQueues.insert(st);
                }
            }
            System.out.println();
            System.out.println("R R P O T Y I I U Q E U <-- sample result is");
        }


    }




}
