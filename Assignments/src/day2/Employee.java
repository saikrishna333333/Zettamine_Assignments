package day2;

import lombok.Data;

@Data
public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
    public abstract void calculateSalary();
    
    


}
