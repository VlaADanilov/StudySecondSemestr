package AISD.Lesson4HomeWork;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){
        int[][] vectors = new int[200][];
        for (int i = 0; i < vectors.length; i++){
            int a = (int) (Math.random() * 5) + 1;
            vectors[i] = new int[a];
            for (int j = 0; j < vectors[i].length; j++){
                vectors[i][j] = (int)(Math.random() * 5);
            }
        }
        System.out.println(Arrays.deepToString(vectors));
        //int[][] vectors = new int[][]{{1,1,1,1}, {1,1,1}, {1,1},{1},{2},{1,2},{1,1,1,1,1,1},{10,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1000,101,1,1,1}};
        sort(vectors);
        System.out.println(Arrays.deepToString(vectors));
    }

    public static void sort(int[][] arr){
        sort(arr,0,arr.length - 1, 0, -1);
    }

    private static void sort(int[][] arr, int start, int end, int index, int pred) {
        if (start < end){
            if (index != pred) {
                for (int i = start; i < end; i++) {
                    for (int j = i + 1; j < end + 1; j++) {
                        if (arr[i].length <= index || arr[j].length <= index) {
                            if (arr[i].length > arr[j].length) swap(arr, i, j);
                        }
                        else{
                            if (arr[i][index] > arr[j][index]) swap(arr, i, j);
                        }
                    }
                }
            }
            int q = start;
            for (int i = start; i < end; i++){
                try {
                    if (arr[i][index] == arr[i + 1][index]) {
                        q++;
                    } else {
                        break;
                    }
                }
                catch (Exception e) {
                    break;
                }
            }
            sort(arr, start, q, index + 1, index);
            sort(arr, q + 1, end, index, index);
        }
    }

    private static void swap(int[][] arr, int i, int j){
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
