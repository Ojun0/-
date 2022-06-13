package Homework;

import java.util.Scanner;
//유저가 입력한 값을 받을 예정

public class ojy20191529_mid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---삼세판 가위 바위 보---");
		System.out.println("1.바위 2.가위 3.보");
		//숫자로 가위 바위 보를 구별
		System.out.print("원하는 숫자를 입력해주세요 :");
		int win = 0;
		
		for(int i=0; i<=2; i++) {
			//국룰 삼세판
			int user = sc.nextInt();
			//유저 입력한 값
			int bot = (int) (Math.random()*3)+1;
			
			switch(user) {
				case 1:
					System.out.println("유저 : 바위");
					switch(bot) {
						case 1:
							System.out.println("상대 : 바위");
							System.out.println("무 승 부");
							break;
						case 2:
							System.out.println("상대 : 가위");
							System.out.println("승 리");
							win +=1;
							break;
						case 3:
							System.out.println("상대 : 보");
							System.out.println("패 배");
							break;
				}
			}
			switch(user) {
			case 2:
				System.out.println("유저 : 가위");
				switch(bot) {
					case 1:
						System.out.println("상대 : 바위");
						System.out.println("패 배");
						break;
					case 2:
						System.out.println("상대 : 가위");
						System.out.println("무 승 부");
						break;
					case 3:
						System.out.println("상대 : 보");
						System.out.println("승 리");
						win +=1;
						break;
				}
			}
			switch(user) {
			case 3:
				System.out.println("유저 : 보");
				switch(bot) {
					case 1:
						System.out.println("상대 : 바위");
						System.out.println("승 리");
						win +=1;
						break;
					case 2:
						System.out.println("상대 : 가위");
						System.out.println("패 배");
						break;
					case 3:
						System.out.println("상대 : 보");
						System.out.println("무 승 부");
						break;
				}
			}	
			
		}
			sc.close();
			System.out.print("\n승리 횟수 :"+ win);
			if(win>=2) {
				System.out.println("\n당신이 승리하였습니다.");
			}
			else {
				System.out.println("\n당신이 패배하였습니다.");
		}
	}

}
