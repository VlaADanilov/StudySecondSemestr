package Lesson1;

import Lesson1.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) throws EmptyElementException{
        LinkedList list = new LinkedList();
        for (int i = 0; i <= 100; i++){
            list.add(Integer.valueOf(i));
        }
        list.pop();
        list.delete(1);
        System.out.println(list);
        System.out.println();

        List list2 = new List();
        for (int i = 0; i <= 100; i++){
            list2.add(Integer.valueOf(i));
        }
        list2.delete(0);
        System.out.println(list2.pop());
        list2.pop();
        System.out.println(list2);
    }
}
