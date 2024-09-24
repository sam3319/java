package control;

import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] intArray= new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int i = 0;i < intArray.length;i++) {
			System.out.print(i+"번쨰 정수 입력 : ");
			intArray[i] = scanner.nextInt();
			if(max < intArray[i])
				max = intArray[i]; 
			if(min > intArray[i])
				min = intArray[i];
			sum += intArray[i];
		}
		for(int i = 0; i < intArray.length;i++) {
			System.out.println(intArray[i]+" ");
		}
		System.out.println();
		System.out.println("최대값 = " + max + ", 최소값 = " + min + " 평균 = " + (double)sum/intArray.length);
		
		
		scanner.close();
	}
}
