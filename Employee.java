/**
  *class Employee
  *@author: shubhamkamble
*/
import java.util.Random;

public class Employee {
	//Constant.
	public static final int IS_EMP_PRESENT = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	/**
	  *Class Calculating Daily Wage Of Employee.
	*/
	public static void calculateDailyWage() {
		//Variables
		int empHours = 0;
		int empDailyWage = 0;

		Random randNo = new Random();
		int empCheck = randNo.nextInt()%2;
		if(empCheck == IS_EMP_PRESENT) {
			empHours = 8;
		}
		empDailyWage = empHours * EMP_RATE_PER_HOUR;
		System.out.println("Employee Daily Wage="+empDailyWage);
	}
	public static void main(String[] args) {
	calculateDailyWage();
	}
}
