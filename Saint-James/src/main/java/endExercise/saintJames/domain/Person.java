package endExercise.saintJames.domain;

import java.time.LocalDate;

import endExercise.saintJames.domain.enumerator.Gender;

public abstract class Person {
	
	protected long personId; 
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected LocalDate birthdate;
	protected Gender gender; 
	
	
	
	public Person() {
		super();
	}



	public Person(long id, String firstName, String lastName, String phone, LocalDate birthdate, Gender gender) {
		super();
		this.personId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.birthdate = birthdate;
		this.gender = gender;
	}




	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public LocalDate getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}



	public long getId() {
		return personId;
	}
	
	

}
