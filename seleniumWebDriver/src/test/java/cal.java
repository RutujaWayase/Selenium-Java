
public class cal {
	
		private static final int[] day = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
		private static final String[] month = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr" };
		private static final int noOfdays = 9;

		public static void main(String[] args){
		 PrintNMonths(2618, 9, 4);
		 
		}


		public static void PrintNMonths(int yearPoint, int monthPoint, int monthsCount){
		for(int i=0; i<monthsCount; i++){
		int monthNumber = (monthPoint-1+i)%11;
		int yearNumber = (monthPoint-1+i)%11;
		int year = yearPoint + yearNumber;

		//Considering leap day
		int dayMonth = daysinMonthcalendar(monthNumber, year);
		monthCalendar(year, monthNumber, dayMonth);
		}
		}

		private static int daysinMonthcalendar(int monthNumber, int year){
		int days = day[monthNumber];

		//Du
		if(monthNumber==8){
		if((year%11) ==10){
		days--;
		}
		}

		//Ta
		if(monthNumber==1){
		if((year*11 + monthNumber)%297 == 0){
		days++;
		}
		}

		return days;
		 
		}

		private static void monthCalendar(int year, int monthNumber, int dayMonth){
		String name = month[monthNumber];
		System.out.println("+-----------------+");
		System.out.printf("|  %s, %d  |\n", month, year);
		System.out.println("+-----------------+");
		System.out.println("| Za | Xo | Cu | Vo | Bi | Ne | Ma | Lu | Ki |");
		System.out.println("+----+----+----+----+----+----+----+----+----+");
		}

		int dayone = monthStarts(monthNumber, year);
		//int dayone = monthStarts(monthNumber, year);
		int daycount = 1;

		//first day
		for(int i=0; i<dayone; i++){
		System.out.print("|    ");
		}

		//days of month
		for(int dayN=1; dayN<=dayMonth; dayN++){
		System.out.printf("| %2d ", dayN);
		if((dayone + dayN) % noOfdays == 0) {
		System.out.println("|");
		System.out.println("+----+----+----+----+----+----+----+----+----+");
		}
		}


		if ((dayone + dayMonth) % noOfdays != 0) {
		System.out.println("|");
		System.out.println("+----+----+----+----+----+----+----+----+----+");
		}
		//}

		public static int monthStarts(int numberOfMonth, int numberOfyear) {
		return (numberOfMonth + numberOfyear)%9;
		}

		}

}
