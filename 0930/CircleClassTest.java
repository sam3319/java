package oop;

class CircleClass {
	public int radius;
	public String name;
	public CircleClass() {
	}
	public double getArea() {
		return 3.141592 * radius * radius;
	}
	
public class CircleClassTest {
	public static void main(String[] args) {
		
	
		CircleClass pizza = new CircleClass();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적" + area);
		
		CircleClass donut = new CircleClass();
		donut.radius = 5;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적" + area);
	}
}
}
