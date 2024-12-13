/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		Dwight.raiseSalary(300);
		double x = Dwight.getAnnualSalary();
		System.out.println(x);


		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		Jim.raiseSalary(300);
		double a = Jim.getAnnualSalary();
		System.out.println(a);
		
		Employee Pam = new Employee(2011,"Pam", "Bessly", 2250.0);
		Pam.employeeToString();
		Pam.raiseSalary(300);
		double b = Pam.getAnnualSalary();
		System.out.println(b);
		
		Employee Austin = new Employee(1234, "Austin","Kim", 1240.55);
		Austin.employeeToString();
		Austin.raiseSalary(300);
		double c = Austin.getAnnualSalary();
		System.out.println(c);
		
	
	
		
		
		
	}
}