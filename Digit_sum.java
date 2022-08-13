import java.util.Scanner;

public class Digit_sum{
	
	public static void main(String args[]){
		
		int m,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		m=s.nextInt();
		while(m>0){
			sum = sum + m%10;
			m=m/10;
		}
		System.out.println("Sum="+sum);
	}
}