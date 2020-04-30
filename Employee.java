/**
  *class Employee
  *@author: shubhamkamble
*/
import java.util.Random;

public class Employee {
	/**
	  *Checking employee is present or absent.
	  *Method Attendance Checking.
	*/
	public static void attendanceChecking(int IS_EMP_PRESENT) {
		Random randNo = new Random();
		int empCheck = randNo.nextInt() % 2;
		if(empCheck == 1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
	public static void main(String[] args) {
	/**
	  *printing Welcome message
	  *Calling attendance Checking
	*/
		//Constant
		int IS_EMP_PRESENT = 1;
		attendanceChecking(IS_EMP_PRESENT);
	}
}
