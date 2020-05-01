/**
  *class Employee
  *refactor code calculating employee Wage.
  *@author: shubhamkamble
*/
import java.util.*;
import java.io.*;

public class EmployeeWage implements Serializable {
	private static final long serVer = 11;

	private String companyName;
	private int empRate;
	private int noOfWorkingDays;
	private int maxMonthHours;

	public EmployeeWage() {
		//def
	}

	public EmployeeWage(final String companyName, final int empRate, final int noOfWorkingDays) {
		//EmployeeWage(companyName, empRate, noOfWorkingDays, 0);
		this.companyName = companyName;
		this.empRate = empRate;
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public EmployeeWage(final String companyName, final int empRate, final int noOfWorkingDays, final int maxMonthHours) {
		this.companyName = companyName;
		this.empRate = empRate;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxMonthHours = maxMonthHours;
	}

	//setter
	//getter

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return this.companyName;
	}

   	public static void main(String[] args) {
		EmployeeWage emp = new EmployeeWage();
		EmployeeWage emp1 = new EmployeeWage("BridgeLabz",20,2,0);
		EmployeeWage emp2 = new EmployeeWage("Google",30,3,4);
	}
}
