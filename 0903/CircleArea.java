package hello;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.141592;
		double radius = 10.0;
		double circleArea;
		
		int i = 6;
		byte b = (byte)i;
		//	cast 연산자 위의 연산이 실행될 때만 int를 byte 타입으로 변경합니다
		//	이후 i는 여전히 int 입니다.
		circleArea = PI * radius * radius;
		
		System.out.println("원의 면적은 = " + circleArea);
	}
}
