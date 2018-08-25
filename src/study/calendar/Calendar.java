package study.calendar;

public class Calendar {
	private final static int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final static int[] LEAP_Max_Days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(long year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else
			return false;
	}

	int getTheEndOfTheMonth(long year, int month) {
		if (isLeapYear(year)) {
			return LEAP_Max_Days[month - 1];
		}
		return Max_Days[month - 1];
	}

	public void printCalender(long year, int month, String weekday) {
		String[] Week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		int[] Day = new int[Week.length];
		
		System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("  ------------------------------");

		int maxDay = getTheEndOfTheMonth(year, month);
		for(int i=0; i<Week.length; i++) {
			
			if(weekday.equals(Week[i])) {
				
				for(int z = 0; z<i; z++) {
					System.out.print("    ");
				}
				
				for(int j=1; j<=maxDay; j++) {
					Day[i] = j;
					System.out.printf("%3d", Day[i]);
					i++;
					
					if(i == Day.length) {
						System.out.println();
						i=0;
					}
				}
				break;
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