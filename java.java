public class java{
 public static void main(String args[]){
	 
	 System.out.println("Hello java");
	 MakeMyTrip.callMe();
 }



}

class MakeMyTrip{
	
	int distance;
	int amount;
	public MakeMyTrip(){
			distance = 100;
			amount = 10000;
	}
	public static void callMe(){
		System.out.println("Success");
	}
}