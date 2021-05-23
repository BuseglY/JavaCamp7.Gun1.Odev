package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seeker")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker implements IEntity {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="year_of_birth")
	private short yearOfBirth;
	
	@Column(name="e_mail")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="job_position_id")
	private int jobPosition;

}
