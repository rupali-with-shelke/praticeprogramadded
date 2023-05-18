package myprogram;

public class LeapYearDemo {

	public static void main(String[] args) {
	
		int year=2017;
		if((year%4)==0) {
			
			System.out.println(year+ "is a leap year");
		}else {
			System.out.println(year+"is not leap year");
		}
		
	}

}
