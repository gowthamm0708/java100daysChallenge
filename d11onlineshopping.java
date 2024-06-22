import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
     int flipkartsh = sc.nextInt();
     int flipkartdis = sc.nextInt();
     int flipkartch = sc.nextInt();
    
     int snapsh = sc.nextInt();
     int snapdis = sc.nextInt();
     int snapch = sc.nextInt();
    
     int amazonsh = sc.nextInt();
     int amazondis = sc.nextInt();
     int amazonch = sc.nextInt();
    
    int fdiscountprice = flipkartsh -(flipkartsh*flipkartdis/100);
    int flipkarttotal = fdiscountprice + flipkartch;
    System.out.println("In Flipkart: Rs."+flipkarttotal);
    
    int sdiscountprice = snapsh -(snapsh*snapdis/100);
    int snaptotal =  sdiscountprice + snapch ;
    System.out.println("In Snapdeal: Rs."+snaptotal);
    
    int adiscountprice = amazonsh -(amazonsh*amazondis/100);
    int amazontotal =  adiscountprice + amazonch ;
    System.out.println("In Amazon: Rs."+amazontotal);
    
    if(flipkarttotal <= snaptotal && flipkarttotal <= amazontotal){
      System.out.println("Choose Flipkart");
    }else if(snaptotal <= amazontotal && snaptotal <= flipkarttotal  ){
    System.out.println("Choose Snapdeal");
    }else{
    System.out.println("Choose Amazon");
    }
  }
}
