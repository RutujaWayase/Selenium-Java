
public class calendarmonth {

	    private static final String[] MONTH_NAMES = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
	    private static final int[] MONTH_DAYS = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
	    private static final int DAYS_IN_WEEK = 9;

	    public static void main(String[] args) {
	        PrintNMonths(2717, 9, 4);
	    }

	    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {
	        for (int i = 0; i < numberOfMonths; i++) {
	            int monthIndex = (startMonth - 1 + i) % 11;
	            int yearOffset = (startMonth - 1 + i) / 11;
	            int year = startYear + yearOffset;

	            // Adjust the number of days for leap day
	            int daysInMonth = getAdjustedDaysInMonth(monthIndex, year);
	            printCalendarForMonth(year, monthIndex, daysInMonth);
	        }
	    }

	    private static int getAdjustedDaysInMonth(int monthIndex, int year) {
	        int days = MONTH_DAYS[monthIndex];

	        // Adjust for leap day in month Du
	        if (monthIndex == 8) {
	            if ((year % 11) == 10) {  // Every 11 years remove a day from Du
	                days--;
	            }
	        }

	        // Adjust for additional day in month Ta every 297 months
	        if (monthIndex == 1) {
	            if ((year * 11 + monthIndex) % 297 == 0) { // 11 * year + monthIndex corresponds to total months
	                days++;
	            }
	        }

	        return days;
	    }

	    private static void printCalendarForMonth(int year, int monthIndex, int daysInMonth) {
	        String monthName = MONTH_NAMES[monthIndex];
	        System.out.println("+-----------------+");
	        System.out.printf("|  %s, %d  |\n", monthName, year);
	        System.out.println("+-----------------+");
	        System.out.println("| Za | Xo | Cu | Vo | Bi | Ne | Ma | Lu | Ki |");
	        System.out.println("+----+----+----+----+----+----+----+----+----+");

	        int firstDay = MonthStartsOn(monthIndex, year);
	        int dayCounter = 1;

	        // Print initial spaces for the first day
	        for (int i = 0; i < firstDay; i++) {
	            System.out.print("|    ");
	        }

	        // Print the days of the month
	        for (int day = 1; day <= daysInMonth; day++) {
	            System.out.printf("| %2d ", day);
	            if ((firstDay + day) % DAYS_IN_WEEK == 0) {
	                System.out.println("|");
	                System.out.println("+----+----+----+----+----+----+----+----+----+");
	            }
	        }

	        // Print end of the last line if not complete
	        if ((firstDay + daysInMonth) % DAYS_IN_WEEK != 0) {
	            System.out.println("|");
	            System.out.println("+----+----+----+----+----+----+----+----+----+");
	        }
	    }

	    // Placeholder for the external method
	    public static int MonthStartsOn(int monthNum, int yr) {
	        // Assume this method is implemented and returns appropriate values
	        // Return dummy value for compilation
	        return (monthNum + yr) % 9; // This is just a placeholder.
	    }
	
}
