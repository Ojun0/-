package Homework;

import java.util.Scanner;
//������ �Է��� ���� ���� ����
import java.util.Random;
//���� ���� ���� �� ����

public class ojy20191529_mid1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---�＼�� ���� ���� ��---");
		System.out.println("1.���� 2.���� 3.��");
		//���ڷ� ���� ���� ���� ����
		System.out.print("���ϴ� ���ڸ� �Է����ּ��� :");
		int win = 0;
		
		for(int i=0; i<=2; i++) {
			//���� �＼��
			int bot = 0;
			int user = sc.nextInt();
			//���� �Է��� ��
			Random r =new Random();
		
			bot = r.nextInt(3)+1;
			//1~3 ���� �� �ϳ��� �����ϰ� ������ ��
		
			System.out.println("���� :" + user);
			System.out.println("��� :" + bot);
		
			if(user == 1) {
				if(bot == 2) {
					System.out.println("�� ��");
					win += 1;
				
				}
				if(bot == 3) {
					System.out.print("�� ��");
				}
				if(bot == 1) {
					System.out.print("�� �� ��");
				}
			}
		
			else if(user == 2) {
				if(bot == 2) {
					System.out.print("�� �� ��");
				}
				if(bot == 1) {
					System.out.print("�� ��");
				}
				if(bot == 3) {
					System.out.print("�� ��");
					win += 1;
				}
			}
			else if(user == 3) {
				if(bot == 1) {
					System.out.print("�� ��");
					win += 1;
				}
				if(bot == 2) {
					System.out.print("�� ��");
				}
				if(bot == 3) {
					System.out.print("�� �� ��");
				}
			}
			else {
				System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �Է� ���ּ���");
			}
		}
		sc.close();
		System.out.print("\n�¸� Ƚ�� :"+ win);
		if(win>=2) {
			System.out.println("\n����� �¸��Ͽ����ϴ�.");
		}
		else {
			System.out.println("\n����� �й��Ͽ����ϴ�.");
		}
	}

}
