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
@Table(name="employer")
@AllArgsConstructor
@NoArgsConstructor
public class Employer implements IEntity{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_id")
	private String companyId;
	
	@Column(name="website")	
	private String website;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="password")
	private String password;
	
}
