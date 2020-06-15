package endExercise.saintJames.domain;

import java.time.LocalDate;

public class Patient extends Person {

	
	private String identityCardId ;
	private boolean isInsured;
	private boolean isDeceased;
	private LocalDate dateDeceased;
	private Address address;
	private PersonnalDoctor personnalDoctor;
	private MedicalRecord medicalRecord;
	
	
	
	public Patient(String identityCardId, boolean isInsured, boolean isDeceased, LocalDate dateDeceased,
			Address address, PersonnalDoctor personnalDoctor, MedicalRecord medicalRecord) {
		super();
		this.identityCardId = identityCardId;
		this.isInsured = isInsured;
		this.isDeceased = isDeceased;
		this.dateDeceased = dateDeceased;
		this.address = address;
		this.personnalDoctor = personnalDoctor;
		this.medicalRecord = medicalRecord;
	}
	public Patient() {
		super();
	}
	public String getIdentityCardId() {
		return identityCardId;
	}
	public void setIdentityCardId(String identityCardId) {
		this.identityCardId = identityCardId;
	}
	public boolean isInsured() {
		return isInsured;
	}
	public void setInsured(boolean isInsured) {
		this.isInsured = isInsured;
	}
	public boolean isDeceased() {
		return isDeceased;
	}
	public void setDeceased(boolean isDeceased) {
		this.isDeceased = isDeceased;
	}
	public LocalDate getDateDeceased() {
		return dateDeceased;
	}
	public void setDateDeceased(LocalDate dateDeceased) {
		this.dateDeceased = dateDeceased;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PersonnalDoctor getPersonnalDoctor() {
		return personnalDoctor;
	}
	public void setPersonnalDoctor(PersonnalDoctor personnalDoctor) {
		this.personnalDoctor = personnalDoctor;
	}
	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}
	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}
	
	
	
	
}
