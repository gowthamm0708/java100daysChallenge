import java.util.*;
class HelloWorld {
  public static void main(String[] args) {
        String name = "gowtham";
     for(int i=1;i< name.length(); i++){
           if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) =='i' ||name.charAt(i) == 'o' ||name.charAt(i) == 'u' ){
              continue;
           }else{
             System.out.print(name.charAt(i));
           }
     }
  }
}
