package gowtham;
import java.util.*;
public class nOddnumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int sum=1;
	  for(int i = 1;i<=n;i++) {
		  sum=sum*i;
			
		  
	  }
	  System.out.println("sum of factorial "+ sum);
	}

} 
