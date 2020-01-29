import java.util.Scanner;

public class MaxDay {
	
	private static  final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	private static  final int[] LEEP_MAX_DAYS= {31,29,31,30,31,30,31,31,30,31,30,31};
	public boolean isLeepYear(int year) {
		if(year%4==0&&(year%100 !=0||year%400==0))
			return true;
		else return false;
	}
		
	public  int GetMaxDays(int year,int month){
		return MAX_DAYS[month-1];
		}
	}

	 public void samplecalendar(int year, int month)
	{
		 System.out.printf("%4d %3d/n",year, month);
		System.out.println(	"SU MO TU WE  TH FR SA"); 
		System.out.println("----------------------------------" );
	int maxday=GetMaxDays( year, month)
		
				
	}

}
