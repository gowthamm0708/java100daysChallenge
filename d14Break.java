package gowtham;
import java.util.*;
public class breakUsingWhile {
public static void main(String[]args) {
	//if the user enter number or the nearrest number is divide by 10 print that
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	 while(n>0) {
		 if(n%10 == 0) {
			 System.out.println(n);	
			 break;
		 }
		n--; 
	 }
	

}
}
