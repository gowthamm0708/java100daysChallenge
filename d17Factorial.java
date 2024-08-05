// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        for(int i=1;i<=num;i++){
       
       factorial *= i;
        //     if(i%2 == 0){
        // System.out.println("Even Numbers "+i);

        //     }
        }
        System.out.println(factorial);
    }
}
