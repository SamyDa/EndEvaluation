package endExercise.saintJames.domain;

import java.util.List;

import endExercise.saintJames.domain.enumerator.BloodGroup;

public class MedicalRecord {
	
	private double length;
	private List<String> allergies;
	private BloodGroup bloodGroup;
	private Patient patient;
	private List<Exam> exams;
	
	
	
	public MedicalRecord(double length, List<String> allergies, BloodGroup bloodGroup, Patient patient,
			List<Exam> exams) {
		super();
		this.length = length;
		this.allergies = allergies;
		this.bloodGroup = bloodGroup;
		this.patient = patient;
		this.exams = exams;
	}
	public MedicalRecord() {
		super();
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public List<String> getAllergies() {
		return allergies;
	}
	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public List<Exam> getExams() {
		return exams;
	}
	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}
	
	
}
