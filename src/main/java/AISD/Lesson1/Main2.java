package AISD.Lesson1;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        paintFigure(str);
    }

    public static void paintFigure(String str){
        String result = createStr(str);
        int[] arr = createChars(str, result);
        for (int i = maxArr(arr) - 1; i >= 0; i--){
            String pr = "";
            for (int x = 0; x < result.length(); x++){
                pr += arr[x] - 1 >= i   ? "#" : " ";
            }
            System.out.println(pr);
        }
        System.out.println(result);
    }

    private static int maxArr(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static int[] createChars(String str, String result){
        int[] ret = new int[result.length()];
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ' && str.charAt(i) != '\n') ret[indexOfChar(result, str.charAt(i))]++;
        }
        return ret;
    }

    private static int indexOfChar(String str, char p){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == p) return i;
        }
        return -1;
    }

    private static String createStr(String str){
        String ret = "";
        for(int i = 0; i < str.length(); i++){
            if (!inStr(ret, str.charAt(i))){
                if(str.charAt(i) != ' ' && str.charAt(i) != '\n') ret += str.charAt(i);
            }
        }
        char[] chars = new char[ret.length()];
        for (int i = 0; i < ret.length(); i++){
            chars[i] = ret.charAt(i);
        }
        Arrays.sort(chars);
        ret = "";
        for (int i = 0; i < chars.length; i++){
            ret += chars[i];
        }
        return ret;
    }

    private static boolean inStr(String str, char p){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == p) return true;
        }
        return false;
    }
}
