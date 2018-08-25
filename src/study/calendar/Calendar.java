package study.calendar;

import java.awt.List;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Calendar {
	private final static int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final static int[] LEAP_Max_Days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return true;
		else	 return false;
		
	}

	int getTheEndOfTheMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_Max_Days[month-1];
		}
		return Max_Days[month - 1];
	}

	public void printCalender(int year, int month) {
		System.out.println("    일   월   화   수   목   금   토");
		System.out.println("  ------------------------------");

		int maxDay = getTheEndOfTheMonth(year, month);
		
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}

// team->share project로 git과 연동함
// show in->system explorer에 들어가면 git파일 생성됨.
// team -> add to index하면 클래스파일에 +모양이 생김. 커밋할 준비가 되었다는 의미.
// staged changes : 커밋 될 파일들 출력
// 커밋하면 로컬저장소에 저장이 됨.
// team->push branch master에 들어가서 원격저장소(git hub)에 저장.