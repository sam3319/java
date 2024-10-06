package oop;

public class CircleConst {
	public int radius;
	public String name;
	public CircleConst() {
		radius = 1; name = "";
	}
	public CircleConst(int radius, String name) {
		this.radius = radius; this.name = name;
	}

	public double getArea() {
		return 3.141592 * radius * radius;
	}
	public static void main(String[] args) {
		CircleConst pizza = new CircleConst(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적" + area);
		
		CircleConst donut = new CircleConst();
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적" + area);
	
	}
}