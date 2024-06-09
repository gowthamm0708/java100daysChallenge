import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int friends = sc.nextInt();
    int teams = sc.nextInt();
    
    int groups = friends / teams;
    int left = friends % teams;
    
    System.out.println("The number of friends in each team is " + groups +" and left out is "+ left);
  }
}
