class Car{
	
	int model;
	String name;
}

class DemoProgram{

	public static void main(String Args[]){

		Car car = new Car();
		car.model = 20;
		car.name = "Hundai i20";
		
		Car car1 = new Car();
		car1.model = 10;
		car1.name = "Hundai i10";

		System.out.println(car.model);
		System.out.println(car.name);
		
		System.out.println(car1.model);
		System.out.println(car1.name);
	}
}

