package Homework;

import java.util.Scanner;
//유저가 입력한 값을 받을 예정
import java.util.Random;
//랜덤 가위 바위 보 게임

public class ojy20191529_mid1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---삼세판 가위 바위 보---");
		System.out.println("1.바위 2.가위 3.보");
		//숫자로 가위 바위 보를 구별
		System.out.print("원하는 숫자를 입력해주세요 :");
		int win = 0;
		
		for(int i=0; i<=2; i++) {
			//국룰 삼세판
			int bot = 0;
			int user = sc.nextInt();
			//유저 입력한 값
			Random r =new Random();
		
			bot = r.nextInt(3)+1;
			//1~3 숫자 중 하나를 랜덤하게 나오게 함
		
			System.out.println("유저 :" + user);
			System.out.println("상대 :" + bot);
		
			if(user == 1) {
				if(bot == 2) {
					System.out.println("승 리");
					win += 1;
				
				}
				if(bot == 3) {
					System.out.print("패 배");
				}
				if(bot == 1) {
					System.out.print("무 승 부");
				}
			}
		
			else if(user == 2) {
				if(bot == 2) {
					System.out.print("무 승 부");
				}
				if(bot == 1) {
					System.out.print("패 배");
				}
				if(bot == 3) {
					System.out.print("승 리");
					win += 1;
				}
			}
			else if(user == 3) {
				if(bot == 1) {
					System.out.print("승 리");
					win += 1;
				}
				if(bot == 2) {
					System.out.print("패 배");
				}
				if(bot == 3) {
					System.out.print("무 승 부");
				}
			}
			else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력 해주세요");
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
