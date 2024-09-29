import java.util.Scanner;

	public class P114 {
		public static void main(String[] args) {
			Scanner sca = new Scanner(System.in);
			
			System.out.print("자동차 상태 입력>>");
			int stateus  = sca.nextInt();
			int temp = stateus & 0b00011111;
			
			if((stateus & 0b10000000) == 0)
				System.out.print("자동차는 정지 상태이고 ");
			else
				System.out.print("자동차는 달리는 상태이고 ");
			
			if((stateus & 0b01000000) == 0)
				System.out.print("에어컨이 꺼진 상태이고 ");
			else
				System.out.print("에어컨이 켜진 상태이고 ");
			
			System.out.print("온도는 " + temp + "도이다.");
			sca.close();
		}
	}