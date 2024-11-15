import java.util.*;
class Main {
    public static void main(String[] args) {
        String word = "ABCDCBA";
        String word2 = "";
        for(int i = word.length()-1;i>=0;i--){
            word2 += word.charAt(i);
            
        }
    if(word.equals(word2)){
        System.out.println("Palindrom");
    }else{
         System.out.println("not Palindrom");
    }
    }
}
