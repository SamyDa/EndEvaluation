package endExercise.saintJames.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Exam {
	
	private LocalDateTime date ; 
	private int bloodPressureLow;
	private int bloodPressureHigh;
	private double weight;
	private int heartRate;
	private Login updatedBy; 	
	private List<Symptom> observedSymptoms;
	private List<Treatment> prescribedTreatments;
	
	public Exam(LocalDateTime date, int bloodPressureLow, int bloodPressureHigh, double weight, int heartRate,
			Login login, List<Symptom> symptoms, List<Treatment> treatments) {
		super();
		this.date = date;
		this.bloodPressureLow = bloodPressureLow;
		this.bloodPressureHigh = bloodPressureHigh;
		this.weight = weight;
		this.heartRate = heartRate;
		this.updatedBy = login;
		this.observedSymptoms = symptoms;
		this.prescribedTreatments = treatments;
	}

	public Exam() {
		super();
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getBloodPressureLow() {
		return bloodPressureLow;
	}

	public void setBloodPressureLow(int bloodPressureLow) {
		this.bloodPressureLow = bloodPressureLow;
	}

	public int getBloodPressureHigh() {
		return bloodPressureHigh;
	}

	public void setBloodPressureHigh(int bloodPressureHigh) {
		this.bloodPressureHigh = bloodPressureHigh;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public Login getLogin() {
		return updatedBy;
	}

	public void setLogin(Login login) {
		this.updatedBy = login;
	}

	public List<Symptom> getSymptoms() {
		return observedSymptoms;
	}

	public void setSymptoms(List<Symptom> symptoms) {
		this.observedSymptoms = symptoms;
	}

	public List<Treatment> getTreatments() {
		return prescribedTreatments;
	}

	public void setTreatments(List<Treatment> treatments) {
		this.prescribedTreatments = treatments;
	}
		
	
	
}
