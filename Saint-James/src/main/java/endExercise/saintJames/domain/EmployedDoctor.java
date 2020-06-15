package endExercise.saintJames.domain;

import java.util.List;

public class EmployedDoctor extends Staff {
	
	private String license; 
	private String consultRoom;
	private List<SpecializationCategory> specializations;
	public EmployedDoctor(String license, String consultRoom, List<SpecializationCategory> specializations) {
		super();
		this.license = license;
		this.consultRoom = consultRoom;
		this.specializations = specializations;
	}
	public EmployedDoctor() {
		super();
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getConsultRoom() {
		return consultRoom;
	}
	public void setConsultRoom(String consultRoom) {
		this.consultRoom = consultRoom;
	}
	public List<SpecializationCategory> getSpecializations() {
		return specializations;
	}
	public void setSpecializations(List<SpecializationCategory> specializations) {
		this.specializations = specializations;
	}

	
}
