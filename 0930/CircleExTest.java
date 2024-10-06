package oop;

public class CircleExTest {
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적" + area);
		
		Circle donut = new Circle();
		donut.radius = 5;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적" + area);
	}
}
