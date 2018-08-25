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
		System.out.println("    ��   ��   ȭ   ��   ��   ��   ��");
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

// team->share project�� git�� ������
// show in->system explorer�� ���� git���� ������.
// team -> add to index�ϸ� Ŭ�������Ͽ� +����� ����. Ŀ���� �غ� �Ǿ��ٴ� �ǹ�.
// staged changes : Ŀ�� �� ���ϵ� ���
// Ŀ���ϸ� ��������ҿ� ������ ��.
// team->push branch master�� ���� ���������(git hub)�� ����.