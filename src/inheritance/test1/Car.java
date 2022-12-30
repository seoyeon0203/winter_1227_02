package inheritance.test1;

public class Car {
	String manufacturer; // 제조사 
	String name; // 자동차명 
	int displacement; // 배기량 
	
/*	public Car() {
		// super();
		System.out.println("Car() 생성자 호출됨");
	}*/
	
	public Car(String manufacturer, String name, int displacement) {
		super();
		this.manufacturer = manufacturer;
		this.name = name;
		this.displacement = displacement;
		System.out.println("Car(String manufacturer, String name, String displacement)");
	}
	
	public void start() {
		System.out.println("(Car)시동을 걸다.");
	}
	
	
}
