import java.util.Scanner;

	public class P113 {
		public static void main(String[] args) {
			Scanner sca = new Scanner(System.in);	//	Scanner 객체 생성
			
			System.out.print("냉장고 상태 입력>>");
			String str = sca.next();				//	2진수 문자열을 저장할 배열 생성
			
			byte stateus = Byte.parseByte(str, 2);	//	Byte.parseByte 메서드를 이용하여 입력받은 문자열 2진수로 파싱
			
			
			if((stateus & 0b00000001) != 0)			//	stateus의 값을 and 연산으로 비교 후 결과 출력
				System.out.print("전원 켜져 있음. ");
			else 
				System.out.print("전원 꺼져 있음. ");
			
			if((stateus & 0b00000010) != 0) 
				System.out.print("문 닫혀 있음. ");
			else 
				System.out.print("문 열려 있음. ");
			
			if((stateus & 0b00000100) != 0)
			    System.out.print("전구 정상 작동. ");
			else
				System.out.print("전구 손상. ");
			
			if((stateus & 0b00001000) != 0)
				System.out.print("냉장고 온도 3도 미만. ");
			else
				System.out.print("냉장고 온도 3도 이상. ");
			
			sca.close();								//	Scanner 객체 종료
		}
}
