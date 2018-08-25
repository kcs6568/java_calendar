package study.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = ">>";

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = 0;
		int year = 0;

		while (true) {
			System.out.println("¿¬µµ ÀÔ·Â ");
			System.out.print("YEAR"+PROMPT);
			year = sc.nextInt();
			if(year == -1) {
				System.out.println("¾È³ç");
				break;
			}

			if (cal.isLeapYear(year)) {
				System.out.println("À±³âÀÔ´Ï´Ù. ¿ù ÀÔ·Â ");
				System.out.print("MONTH"+PROMPT);
				month = sc.nextInt();

				if (month == -1) {
					System.out.println("¾È³ç");
					System.exit(0);
					break;
				}
				if (month >= 13) {
					continue;
				}
				cal.printCalender(year, month);
			}

			else {
				System.out.println("À±³âÀÌ ¾Æ´Õ´Ï´Ù. ¿ù ÀÔ·Â ");
				System.out.print("MONTH"+PROMPT);
				month = sc.nextInt();

				if (month == -1) {
					System.out.println("¾È³ç");
					System.exit(0);
					break;
				}
				if (month >= 13) {
					continue;
				}
				cal.printCalender(year, month);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
