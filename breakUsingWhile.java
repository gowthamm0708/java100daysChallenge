package gowtham;
import java.util.*;
public class addtheNumbers {

	public static void main(String[] args) {
		/*add the numbers using while loop if user enter the negative number break the loop*/
		double n,sum = 0.0;
		Scanner sc = new Scanner(System.in);
		 while(true) {
			 n=sc.nextDouble();
			 if(n<0.0) {
				 break;
			 }
			 sum +=n;
		 }
		 System.out.println(sum);
		sc.close();

	} 

}
 
