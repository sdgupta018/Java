
import java.util.*;

public class Shape{

public static void main(String args[]){

    int r;
	double pi=3.14,area;
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the radus");
	r= s.nextInt();
	area=r*r*pi;

	System.out.println("area of Shape="+area);

}


}