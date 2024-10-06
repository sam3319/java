package oop;

public class MainTest {
	public void printInfo() {
		System.out.println("학번 : 12345679");
		System.out.println("이름 : 홍길동");
	}
public static void main(String[] args) {
	MainTest mt = new MainTest();
	
	mt.printInfo();
}
}