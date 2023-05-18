package myprogram;

import java.util.Scanner;
  //WAP to print table of given number
public class ForLoopDemo {

	public static void main(String[] args) {
		
		/*for(int i=0;i<=5;i++) {
		System.out.println(i);
			
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();

		
		for(int i1=1;i1<=6;i1++) {
			System.out.println(i1 + "x"+i1 +" ="+i1*i);
					
		}
		

	}
}


