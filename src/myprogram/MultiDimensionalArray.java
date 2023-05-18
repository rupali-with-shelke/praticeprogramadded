package myprogram;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	
		
		String s [][] = {{"EmpName"," EmpId"},{"SACHIN","123"},{"DHONI","456"},{"VIRAT","789"}};
		
	    for(int i=0;i<4;i++) {
	    	
	    	for(int j=0;j<2;j++) {
	    		
	    		System.out.print(s[i][j]+"   ");
	    	}
	    	
	    	System.out.println("\n");	
	    }
		
				
	}
		
}

