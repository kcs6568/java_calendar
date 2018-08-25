package study.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = ">>";

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = 0;
		int year = 0;
		String weekday = "";

		while (true) {
			System.out.println("���� �Է�(���� : -1) ");
			System.out.print("YEAR" + PROMPT);
			year = sc.nextInt();
			if(year < 1) {
				System.out.println("�ȳ�");
				break;
			}
			
			System.out.println("�� �Է�(���� : -1)");
			System.out.print("MONTH" + PROMPT);
			month = sc.nextInt();
			
			if (month > 12 || month < 1) {
				System.out.println("�߸��� �Է��̴�.");
				continue;
			}
			
			if (month == -1) {
				System.out.println("�ȳ�");
				break;
			}
			if (month > 12 || month < 1) {
				System.out.println("�߸��� �Է��̴�.");
				continue;
			}
				

			System.out.println("ù ��° ������ �Է��ϼ���(��, ȭ, ��, ��, ��, ��, ��)");
			System.out.print("WEEKDAY" + PROMPT);
			weekday = sc.next();
			
			if (cal.isLeapYear(year)) {
				cal.printCalender(year, month, weekday);
			}
			
			else {
				cal.printCalender(year, month, weekday);
			}

		}
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
