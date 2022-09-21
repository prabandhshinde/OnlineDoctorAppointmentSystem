package project.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor_info")
public class Doctor_info {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long doctor_id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private long mob_number;
	@Column
	private String qualification;
	@Column
	private String university;
	@Column
	private String specilization;
	@Column
	private Date passing_year;
	@Column
	private String licence_number;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String licence_copy;
	@Column
	private String image;
	@Column
	private boolean is_valid;
	
	
	@OneToOne
	@JoinColumn(name = "clinic_id",referencedColumnName = "clinic_id")
	private Clinic_info clinic;

	public long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getMob_number() {
		return mob_number;
	}

	public void setMob_number(long mob_number) {
		this.mob_number = mob_number;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public Date getPassing_year() {
		return passing_year;
	}

	public void setPassing_year(Date passing_year) {
		this.passing_year = passing_year;
	}

	public String getLicence_number() {
		return licence_number;
	}

	public void setLicence_number(String licence_number) {
		this.licence_number = licence_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLicence_copy() {
		return licence_copy;
	}

	public void setLicence_copy(String licence_copy) {
		this.licence_copy = licence_copy;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isIs_valid() {
		return is_valid;
	}

	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
	}

	public Clinic_info getClinic() {
		return clinic;
	}

	public void setClinic(Clinic_info clinic) {
		this.clinic = clinic;
	}
	
	
	

	
}
