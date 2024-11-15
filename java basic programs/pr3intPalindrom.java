import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int originalnum = num;
       int rev = 0;
        while(num!=0){
            int digit = num %10;
            rev = rev*10+digit;
            num = num/10;
            
        }
    if(originalnum==rev){
        System.out.println("Palindrom");
    }else{
         System.out.println("not Palindrom");
    }
    }
}
