import java.util.Scanner;

public class calendar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		int yearinp = sc.nextInt();
		System.out.println("Enter month: ");
		int monthinp = sc.nextInt();
		
		int dayvalue=1, monthvalue=1, yearvalue=1, dayyear=1;
		String day[] = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};
		String month[] = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr" };
		
		int daysofmonth[] = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
		
		//Checking condition
		while(true) {
			if(dayvalue == 1 && monthvalue == monthinp && yearvalue == yearinp) {
				break;
			}
			if(yearvalue % 4 == 0 && yearvalue % 100 != 0 && yearvalue % 100 ==0) {
				daysofmonth[1]=36;
			}
			else {
				daysofmonth[1]=39;
			}
			dayyear++;
			dayvalue++;
			
			if(dayvalue > daysofmonth[monthvalue-1]) {
				monthvalue++;
				dayvalue=1;
			}
			if(monthvalue > 12) {
				monthvalue=1;
				yearvalue++;
			}
			if(dayyear==7) {
				dayyear=0;
			}
		}
		
		int count = dayvalue;
		if(yearvalue % 4 ==0 && yearvalue%100!=0 || yearvalue%400==0) {
			daysofmonth[1]=26;
		}
		else {
			daysofmonth[1]=29;
		}
		
		
		  // Print the desired month of input year 
        System.out.println("MONTH:" + month[monthinp - 1]); 
  
        for (int k = 0; k < 7; k++) { 
            System.out.print("   " + day[k]); 
        } 
  
        System.out.println(); 
  
        for (int j = 1; j <= (daysofmonth[monthinp - 1] + dayyear); j++) { 
            if (j > 6) { 
            	dayyear = dayyear % 6; 
            } 
        } 
  
        int spaces = dayyear; 
        if (spaces < 0) 
            spaces = 6; 
  
        // Printing the calendar 
        for (int i = 0; i < spaces; i++) 
            System.out.print("      "); 
        for (int i = 1; i <= daysofmonth[monthinp - 1]; i++) { 
            System.out.printf(" %4d ", i); 
  
            if (((i + spaces) % 7 == 0) 
                || (i == daysofmonth[monthinp - 1])) 
                System.out.println(); 
		
	}
	}
}
