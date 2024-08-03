package gowtham;
import java.util.*;
public class breakUsingWhile {
public static void main(String[]args) {
	int array1[] = {59,34,76,23,54,887,232,54,75,5,24,35,5};
	int min = array1[0];
	for(int i =1;i<array1.length;i++) {
		if(min>array1[i])
			min =array1[i];
	}
	
	System.out.println(min);
	
}
}
