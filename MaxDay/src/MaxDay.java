import java.util.Scanner;

public class MaxDay {
	
	private static  final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	public  int GetMonthOfMaxDays(Scanner scanner){
		return MAX_DAYS[scanner-1];
		}
	}

	 public void samplecalendar(int year, int month)
	{
		 System.out.printf("%4d %3d/n",year month);
		System.out.println(
				 System.out.printf("%4d %3d/n",year, month);
		System.out.println(	"SU MO TU WE  TH FR SA"); 
		System.out.println("----------------------------------" );	
	}


