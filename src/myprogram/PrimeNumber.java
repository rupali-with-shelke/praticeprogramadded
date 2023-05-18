package myprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=43;
		int i;
		int flag=0;
		for(i=2;i<num/2;i++) {
			
			if(num%i==0) {
				System.out.println("It is not an prime number");
				flag=1;
				break;
			}
		}
			if(flag==0) {
				System.out.println("it is a prime number");
			}
				
		}
		

}
