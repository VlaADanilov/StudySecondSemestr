package Lesson1;

public class List implements List301{
    private Integer[] arr;
    private int indexNow;

    public List(){
        arr = new Integer[50];
        indexNow = 0;
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
