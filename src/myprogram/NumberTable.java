package myprogram;

import java.util.Scanner;

public class NumberTable {
    //WAP TO PRINT NUMBER TABLE OF THE GIVEN NUMBER
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
         System.out.println("Enter the number  :");
         int i =sc.nextInt();
         int j=1;
         
        // int j=11;
        // while(j>10)
        while(j<=10) {
        	 
        	 System.out.println(i*j);
        	 j=j+1;
        	// j--;
        	 
        	 
         }
         System.out.println("Program exited  :");
	}

}
