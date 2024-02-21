package AISD.Lesson1;

import java.util.Arrays;

// n - длина строки
// p - максимальное кол-во вхождения среди элементов
// q - кол-во разных элементов

public class Main2 {
    public static void main(String[] args) {
        String str = "@@@#asdfghYYTRRRRRRRFFVVBNJSYUEIWO(*(*(*88*(5/+```";
        paintFigure(str);
        // результат по времени: O(n*log(n) + pq) ==> O(n*log(n))
        // результат по памяти: O(n + q) ==> O(n)
    }


    public static void paintFigure(String str){
        String result = createStr(str);
        // O(n) - память
        // O(n log(n)) время
        int[] arr = createChars(str, result);
        // O(q) - память
        //O(n log(p)) - время
        for (int i = maxArr(arr) - 1; i >= 0; i--){
            // O(p) - время
            String pr = "";
            for (int x = 0; x < result.length(); x++){
                // O(q) - время
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
        for (int i = 0; i < str.length(); i++){ // O(n)
            if(str.charAt(i) != ' ' && str.charAt(i) != '\n') ret[indexOfChar(result, str.charAt(i))]++; //O(log(p))
        }
        return ret;
    }

    private static int binaryFing(String str, int l, int r, char chr){
        //O(log p) время

        if (l == r){
            return l;
        }
        int m = l + (r - l) / 2;
        if (str.charAt(m) > chr){
            return binaryFing(str,l, m - 1, chr);
        }
        else{
            if (str.charAt(m) < chr) return binaryFing(str, m + 1, r, chr);
        }
        return m;
    }

    private static int indexOfChar(String str, char p){
        // O(log n) время
        return binaryFing(str, 0, str.length() - 1, p);
    }

    private static String createStr(String str){
        String ret = "";
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++){
            // O(n) время
            chars[i] = str.charAt(i);
        }
        Arrays.sort(chars);
        //O(n log(n)) время
        for(int i = 0; i < chars.length; i++){
            //O(n) время
            if (!inStr(ret, chars[i])){
                //O(1) время
                if(chars[i] != ' ' && chars[i] != '\n') ret += chars[i];
            }
        }
        return ret;
    }

    private static boolean inStr(String str, char p){
        if (str.length() == 0) return false;
        return str.charAt(str.length() - 1) == p;
    }
}
