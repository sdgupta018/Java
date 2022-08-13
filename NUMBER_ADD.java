

import java.util.Scanner;

public class NUMBER_ADD{

public static void main(String args[]){
	
	int p,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the numbera:");
	
	p=s.nextInt();

	  while (p>0){
    sum=sum+p%100;
   
    p=p/100;
	 
	  }
	
	System.out.println("sum="+sum);
}



}