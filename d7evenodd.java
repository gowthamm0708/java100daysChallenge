// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class find {
   void evenorodd (int num){
      if(num % 2 == 0){
          System.out.println("even");
      }else{
          System.out.println("odd");
      }
   }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        find obj = new find();
        obj.evenorodd (sc.nextInt());
    
  
     
    }
}
