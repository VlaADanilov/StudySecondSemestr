package Lesson1;

public class List implements List301{
    private Integer[] arr;
    private int indexNow;

    public List(){
        arr = new Integer[50];
        indexNow = 0;
    }

    public List(int[] array){
        arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++){
            arr[i] = Integer.valueOf(array[i]);
        }
        indexNow = arr.length;
    }

    public int findFirst(int x) {
        for (int i = 0; i < size(); i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public void deleteAll(int x) {
        for (int i = 0; i < size(); i++){
            if (arr[i] == x){
                delete(i);
            }
        }
    }

    public void add(Integer e) throws EmptyElementException {
        if (e == null){
            throw new EmptyElementException();
        }
        if (size() == arr.length){
            Integer[] arr2 = new Integer[arr.length * 2];
            for (int i = 0; i < arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }

        arr[indexNow] = e;
        indexNow++;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (index >= indexNow || index < 0){
            throw new IndexOutOfBoundsException();
        }
        indexNow--;
        sdvig(index);
    }

    private void sdvig(int index){
        for (int i = index; i < size(); i++){
            arr[i] = arr[i+1];
            arr[i+1] = null;
        }
    }

    public Integer pop() {
        return arr[--indexNow];
    }

    public Integer get(int index) throws IndexOutOfBoundsException {
        if (index >= indexNow || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int size() {
        return indexNow;
    }

    public String toString(){
        String ret = "";
        for (int i = 0; i < size(); i++){
            ret += arr[i] + " ";
        }
        return ret.trim();
    }
}
