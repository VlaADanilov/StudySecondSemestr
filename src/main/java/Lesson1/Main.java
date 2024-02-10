package Lesson1;

import Lesson1.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) throws EmptyElementException{
        LinkedList list = new LinkedList(new int[]{1,2,3,1,5,3,3,3});
        System.out.println(list.findFirst(5));
        list.deleteAll(3);
        System.out.println(list);
        System.out.println();

        List list2 = new List(new int[]{1,2,3,1,5,3,3,3});
        System.out.println(list2.findFirst(5));
        list2.deleteAll(3);
        System.out.println(list2);
    }
}
