// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    static int methodov(int a,int b){
        return a+b;
    }
   static int methodov(int a,int b,int c){
       return a+b+c;
   } 
   static double methodov(double a,double b){
       return a-b;
   }
    
    
    
    public static void main(String[] args) {
        System.out.println(methodov(10,7));
         System.out.println(methodov(10,7,5));
          System.out.println(methodov(10.5,7.5));
    }
}
