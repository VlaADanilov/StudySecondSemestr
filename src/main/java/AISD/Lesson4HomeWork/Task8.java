package AISD.Lesson4HomeWork;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,4,8};
        System.out.println(smallest(arr));
    }
    public static int smallest(int[] arr){
        int rez = 1;
        for (int num : arr){
            if (num <= rez) rez += num;
            else break;
        }
        return rez;
    }
}
