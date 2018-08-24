package study.calendar;

import java.util.Scanner;

public class Calendar {
	private final static int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	int getTheEndOfTheMonth(int month) {
		return Max_Days[month - 1];
	}

	public static void main(String[] args) {
		/*
		 * System.out.println("일 월 화 수 목 금 토");
		 * System.out.println("--------------------");
		 * System.out.println("  1    2    3    4    5    6    7");
		 * System.out.println("  8    9  10  11  12  13  14");
		 * System.out.println("15  16  17  18  19  20  21");
		 * System.out.println("22  23  24  25  26  27  28");
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.printf("%n두 수를 입력하세요.%n");
		 * int n1 = sc.nextInt(); int n2 = sc.nextInt();
		 * System.out.println("두 수의 합은 "+(n1+n2)+"입니다."); sc.close(); //스캐너 사용종료.
		 */
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		String prompt = ">";
		int month = 0;
		
		while(true) {
			System.out.print("월을 입력" + prompt);
			month = sc.nextInt();
			
			if(month == -1) {
				System.out.println("안녕");
//				System.exit(0);
				break;
			}
			if (month >= 13) {
				continue;//처음으로 돌아감.
			}
			
			System.out.println(month + "월은 " + cal.getTheEndOfTheMonth(month) + "일까지 입니다.");
		}
		
		sc.close();
	}
}

// team->share project로 git과 연동함
// show in->system explorer에 들어가면 git파일 생성됨.
// team -> add to index하면 클래스파일에 +모양이 생김. 커밋할 준비가 되었다는 의미.
// staged changes : 커밋 될 파일들 출력
// 커밋하면 로컬저장소에 저장이 됨.
// team->push branch master에 들어가서 원격저장소(git hub)에 저장.