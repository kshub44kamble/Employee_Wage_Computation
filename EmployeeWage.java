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
		EmployeeWage empWage = new EmployeeWage();
		empWage.EmployeeWage("DMart", 20, 2, 10);
		empWage.EmployeeWage("Reliance", 10, 4, 20);
		System.out.println("Total Wage for DMart company: "+empWage);
	}
}
