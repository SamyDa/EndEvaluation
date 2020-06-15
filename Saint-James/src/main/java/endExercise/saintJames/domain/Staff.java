package endExercise.saintJames.domain;

import java.time.LocalDate;

public abstract class Staff extends Person {
	
	protected long staffId; 
	protected String function;
	protected String workphone;
	protected double salary;
	protected LocalDate dateEmployment;
	
	public Staff() {
		super();
	}
	
	public Staff(long staffId, String function, String workphone, double salary, LocalDate dateEmployment) {
		super();
		this.staffId = staffId;
		this.function = function;
		this.workphone = workphone;
		this.salary = salary;
		this.dateEmployment = dateEmployment;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getWorkphone() {
		return workphone;
	}

	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateEmployment() {
		return dateEmployment;
	}

	public void setDateEmployment(LocalDate dateEmployment) {
		this.dateEmployment = dateEmployment;
	}

	public long getStaffId() {
		return staffId;
	}
	
	
	
}
