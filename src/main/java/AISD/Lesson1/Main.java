package AISD.Lesson1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String result =  new  String( Files.readAllBytes ( Paths.get ("C:\\Users\\User\\IdeaProjects\\StudyTWOsemestr\\src\\main\\java\\AISD\\Lesson1\\transport.json")),          StandardCharsets.UTF_8 ) ;
        System.out.println(checker(result));
    }

    public static boolean checker(String str){
        int countO = 0;
        int countScob = 0;
        for (int i = 0; i < str.length(); i++){

            if (countO < 0 || countScob < 0) {
                return false;
            }
            if (str.charAt(i) == '{') {
                countO++;
            }
            if (str.charAt(i) == '}') {
                countO--;
            }
            if (str.charAt(i) == '[') {
                countScob++;
            }
            if (str.charAt(i) == ']') {
                countScob--;
            }
        }
        return (countO == 0 && countScob == 0);
    }
}
