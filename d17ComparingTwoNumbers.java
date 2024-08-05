import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("Number1 is greater than num 2");
        }else if(num1 < num2){
           System.out.println("Number1 is lesser  than num 2");  
        }else{
            System.out.println("Number1 and num 2 equal");  
        }
    }
}
