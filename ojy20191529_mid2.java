package Homework;

import java.util.Scanner;
//������ �Է��� ���� ���� ����

public class ojy20191529_mid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---�＼�� ���� ���� ��---");
		System.out.println("1.���� 2.���� 3.��");
		//���ڷ� ���� ���� ���� ����
		System.out.print("���ϴ� ���ڸ� �Է����ּ��� :");
		int win = 0;
		
		for(int i=0; i<=2; i++) {
			//���� �＼��
			int user = sc.nextInt();
			//���� �Է��� ��
			int bot = (int) (Math.random()*3)+1;
			
			switch(user) {
				case 1:
					System.out.println("���� : ����");
					switch(bot) {
						case 1:
							System.out.println("��� : ����");
							System.out.println("�� �� ��");
							break;
						case 2:
							System.out.println("��� : ����");
							System.out.println("�� ��");
							win +=1;
							break;
						case 3:
							System.out.println("��� : ��");
							System.out.println("�� ��");
							break;
				}
			}
			switch(user) {
			case 2:
				System.out.println("���� : ����");
				switch(bot) {
					case 1:
						System.out.println("��� : ����");
						System.out.println("�� ��");
						break;
					case 2:
						System.out.println("��� : ����");
						System.out.println("�� �� ��");
						break;
					case 3:
						System.out.println("��� : ��");
						System.out.println("�� ��");
						win +=1;
						break;
				}
			}
			switch(user) {
			case 3:
				System.out.println("���� : ��");
				switch(bot) {
					case 1:
						System.out.println("��� : ����");
						System.out.println("�� ��");
						win +=1;
						break;
					case 2:
						System.out.println("��� : ����");
						System.out.println("�� ��");
						break;
					case 3:
						System.out.println("��� : ��");
						System.out.println("�� �� ��");
						break;
				}
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
