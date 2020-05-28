package FinalExam;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
        int n; 
        int fact = 1; 
 
        System.out.print("Enter any positive integer number: ");
        
        n = console.nextInt();
 
        for(int i=1; i<=n; i++)
        {
            fact *= i;
        }
 
        System.out.println("Factorial of  " + n + "  =  "  + fact);

	}

}
