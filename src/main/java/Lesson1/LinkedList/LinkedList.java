package Lesson1.LinkedList;

import Lesson1.EmptyElementException;
import Lesson1.List301;

public class LinkedList implements List301 {
    private Element head;
    private int len = 0;

    public LinkedList(Element head) {
        this.head = head;
        len++;
    }

    public LinkedList() {
    }

    public LinkedList(int[] arr){
        this();
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

    public int findFirst(int x) {
        Element temp = head;
        for (int i = 0; i < size(); i++){
            if (temp.value == x){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }


    public void deleteAll(int x) {
        Element temp = head;
        for (int i = 0; i < size(); i++){
            if (temp.value == x){
                delete(i);
            }
        }
    }

    public void add(Integer e) throws EmptyElementException {
        if (e == null){
            throw new EmptyElementException();
        }

        if (head == null){
            head = new Element(e);
        }
        else{
            Element temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Element(e);
        }
        len++;
    }


    public void delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            head = head.next;
        }
        else{
            Element temp = head;
            Element pred = head;
            for (int i = 0; i < index; i++){
                pred = temp;
                temp = temp.next;
            }
            pred.next = temp.next;
        }
        len--;
    }


    public Integer pop() {
        Element ret;
        Element pred = head;
        Element temp = head;
        while(temp.next != null){
            pred = temp;
            temp = temp.next;
        }
        ret = temp;
        pred.next = null;
        len--;
        return ret.value;
    }


    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        int ind = 0;
        Element temp = head;
        while (ind < index){
            temp = temp.next;
            ind++;
        }
        return temp.value;
    }


    public int size() {
        return len;
    }

    public String toString(){
        Element temp = head;
        String ret = "";
        while (temp != null){
            ret += temp.value + " ";
            temp = temp.next;
        }
        return ret.trim();
    }
}
