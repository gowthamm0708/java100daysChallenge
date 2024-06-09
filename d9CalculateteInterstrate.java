import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    
    double principal = sc.nextDouble();
     double interst = sc.nextDouble();
     double years = sc.nextDouble();
    
    double tointerst = principal*interst*years/100;
    double finalsettle = tointerst+principal;
    
    double discount = 0.02*tointerst;
    
    double totalsettle = finalsettle-discount;
    
    System.out.printf("%.2f\n",tointerst);
     System.out.printf("%.2f\n",finalsettle);
     System.out.printf("%.2f\n",discount);
     System.out.printf("%.2f\n",totalsettle);  
  }
}
