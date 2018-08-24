package study.calendar;

import java.util.Scanner;

public class Calendar {
	private final static int[] Max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int getTheEndOfTheMonth(int month) {
		return Max_Days[month-1];
	}
	

	public static void main(String[] args) {
		/*
		 * System.out.println("�� �� ȭ �� �� �� ��");
		 * System.out.println("--------------------");
		 * System.out.println("  1    2    3    4    5    6    7");
		 * System.out.println("  8    9  10  11  12  13  14");
		 * System.out.println("15  16  17  18  19  20  21");
		 * System.out.println("22  23  24  25  26  27  28");
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.printf("%n�� ���� �Է��ϼ���.%n");
		 * int n1 = sc.nextInt(); int n2 = sc.nextInt();
		 * System.out.println("�� ���� ���� "+(n1+n2)+"�Դϴ�."); sc.close(); //��ĳ�� �������.
		 */
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.printf("�� �Է� : ");
		int month = sc.nextInt();
		System.out.println(month+"�� ���� "+cal.getTheEndOfTheMonth(month)+"�ϱ��� �Դϴ�.");
		sc.close();
	}
}

// team->share project�� git�� ������
// show in->system explorer�� ���� git���� ������.
// team -> add to index�ϸ� Ŭ�������Ͽ� +����� ����. Ŀ���� �غ� �Ǿ��ٴ� �ǹ�.
// staged changes : Ŀ�� �� ���ϵ� ���
// Ŀ���ϸ� ��������ҿ� ������ ��.
// team->push branch master�� ���� ���������(git hub)�� ����.