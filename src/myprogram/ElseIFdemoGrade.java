package myprogram;

public class ElseIFdemoGrade {
	/*   
	 *     grade   min    max
	        A       91     100
	        B       81     90    
            C       71     80
            D       61     70
            E       51     60
            F       41     50      */
	public static void main(String[] args) {
		
		//int marks=91;
		//int marks =81;
		int marks=41;
		char grade ='x';
		if(marks<1 || marks>100) {//it gives 0 output that why it is invalid
		System.out.println("it is invalid marks");	
			
		}else if(marks>=91) {
			System.out.println(grade='A');
		}else if(marks>=81) {
			System.out.println(grade='B');
		}else if (marks>=71) {
			System.out.println(grade='c');
		}else if(marks>=61) {
			System.out.println(grade ='D');
		}else if (marks>=51) {
			System.out.println(grade ='E');
		}else {
			System.out.println(grade = 'F');
		}
		
		

	}

}
