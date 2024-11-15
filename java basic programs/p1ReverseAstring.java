import java.util.*;
class Main {
    public static void main(String[] args) {
        String word = "ABCD";
        String word2 = "";
        for(int i = word.length()-1;i>=0;i--){
            word2 += word.charAt(i);
            
        }
        System.out.println(word2);
    }
}
