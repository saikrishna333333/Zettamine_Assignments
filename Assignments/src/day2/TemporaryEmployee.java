package day2;

public class TemporaryEmployee extends Employee {
	private int  hoursWorked;
	
    private int hourlyWages;

	public TemporaryEmployee(int employeeId, String employeeName,
			int hoursWorked, int hourlyWages ) {
		super(employeeId, employeeName);
		
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		
	}

	@Override
	public void calculateSalary() {
       double salary = this.hoursWorked * this.hourlyWages;
       this.setSalary(salary);
		System.out.println("Salary: "+salary);
	}

	@Override
	public String toString() {
		return "TemporaryEmployee [getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()=" + getEmployeeName()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
    
    


}
