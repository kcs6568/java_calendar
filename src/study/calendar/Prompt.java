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
			System.out.println("연도 입력(종료 : -1) ");
			System.out.print("YEAR" + PROMPT);
			year = sc.nextInt();
			if(year < 1) {
				System.out.println("안녕");
				break;
			}
			
			System.out.println("월 입력(종료 : -1)");
			System.out.print("MONTH" + PROMPT);
			month = sc.nextInt();
			
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력이다.");
				continue;
			}
			
			if (month == -1) {
				System.out.println("안녕");
				break;
			}
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력이다.");
				continue;
			}
				

			System.out.println("첫 번째 요일을 입력하세요(월, 화, 수, 목, 금, 토, 일)");
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
