package oop;

import java.util.Scanner;

public class Rectangle {
	int height;
	int width;
	
	public int getArea() {
		return height * width;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">>");
		rect.height = scanner.nextInt();
		rect.width = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea() + "입니다.");
		
		scanner.close();
	}
}
