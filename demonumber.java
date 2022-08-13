import java.util.Scanner;

public class demonumber{

      public static void main(String args[]){
	  int n,sum=0;
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter value of N: ");
	  n=s.nextInt(); 
	  System.out.println("value of sum="+(n*(n+1)/2));
   }
}