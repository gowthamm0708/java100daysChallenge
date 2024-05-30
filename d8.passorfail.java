import java.util.*;
class school {
    int passorfail(int num){
        if(num >= 35){
            System.out.println("pass");
        }else{
          System.out.println("Sorry you did not pass the exam !!!! ");  
        }
        return num;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        school obj1 = new school();
        int s1=obj1.passorfail(sc.nextInt());
         
    }
}
