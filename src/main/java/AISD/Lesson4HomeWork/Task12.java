package AISD.Lesson4HomeWork;

public class Task12 {
    public static void main(String[] args) {
        String[] strs = new String[]{"abcdddd", "abgy", "as", "az","ABCD", "EGR", "eyz"};
        System.out.println(contactWithSort(strs));

    }

    public static String contactWithSort(String[] strs){
        return contactWithSort(strs, 0, strs.length - 1);
    }

    private static String contactWithSort(String[] strs, int start, int end){
        int m = (end + start) / 2;
        if (end == start) return strs[end];
        return containsStrs(contactWithSort(strs, start, m), contactWithSort(strs, m + 1, end));
    }

    public static String containsStrs(String str1, String str2){
        StringBuilder res = new StringBuilder();
        int x = 0, y = 0;
        while (x < str1.length() && y < str2.length()){
            if (str1.charAt(x) <= str2.charAt(y)){
                res.append(str1.charAt(x));
                x++;
            }
            else{
                res.append(str2.charAt(y));
                y++;
            }
        }
        while (x < str1.length()){
            res.append(str1.charAt(x));
            x++;
        }
        while (y < str2.length()){
            res.append(str2.charAt(y));
            y++;
        }
        return res.toString();
    }
}
