package Programming.Lesson2HomeWork;

import Programming.Lesson1.EmptyElementException;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
        OrderedList<Integer> ord = new OrderedList<>();
        for (int i = 0; i < 10; i++) {
            ord.add(Integer.valueOf(i));
        }
        ord.add(5);
        ord.add(5);
        ord.add(5);
        ord.add(5);
        ord.add(5);
        ord.add(5);
        ord.add(8);
        ord.add(9999);
        ord.deleteAll(5);
        System.out.println(ord);
        System.out.println(ord.getIndex(Integer.valueOf(9999)));
    }
}
