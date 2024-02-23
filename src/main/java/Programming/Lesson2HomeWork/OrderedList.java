package Programming.Lesson2HomeWork;

import Programming.Lesson1.EmptyElementException;
import Programming.Lesson1.LinkedList.Element;
import Programming.Lesson1.LinkedList.LinkedList;

import java.util.Arrays;

public class OrderedList<T extends Comparable> extends LinkedList {
    public OrderedList(){}

    public OrderedList(Element e){
        this.head = head;
        len++;
    }

    public OrderedList(T[] arr){
        this();
        Arrays.sort(arr);
        len = arr.length;
        if (arr.length != 0){
            head = new Element(arr[0]);
            Element temp = head;
            for (int i = 1; i < arr.length; i++){
                temp.next = new Element(arr[i]);
                temp = temp.next;
            }
        }

    }

    public void add(T e) throws EmptyElementException{
        if (e == null){
            throw new EmptyElementException();
        }

        if (head == null){
            head = new Element(e);
        }
        else{
            Element temp = head;
            if (e.compareTo(head.value) == -1){
                head = new Element(e);
                head.next = temp;
            }
            else {
                Element prev = head;
                do {
                    prev = temp;
                    temp = temp.next;
                } while (temp != null && e.compareTo(temp.value) == 1);

                Element now = new Element(e);
                prev.next = now;
                now.next = temp;
            }
        }
        len++;
    }

    public int getIndex(T e){
        Element[] elems = new Element[size()];
        Element temp = head;
        for (int i = 0; i < size(); i++){
            elems[i] = temp;
            temp = temp.next;
        }
        int index = binaryFing(elems,0,size() - 1, e);
        if (index == -1) return -1;
        while(index != 0){
            if (!elems[index - 1].equals(elems[index])) break;
            index--;
        }
        return index;
    }

    private int binaryFing(Element[] elems ,int l, int r, T e){
        //O(log n) время

        if (l == r ){
            if (e.compareTo(elems[l].value) == 0) return l;
            else return -1;
        }
        int m = l + (r - l) / 2;
        if (e.compareTo(elems[m].value) == -1){
            return binaryFing(elems,l, m - 1, e);
        }
        else{
            if (e.compareTo(elems[m].value) == 1) return binaryFing(elems, m + 1, r, e);
        }
        return m;
    }
}
