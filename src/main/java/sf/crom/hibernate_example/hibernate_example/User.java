package sf.crom.hibernate_example.hibernate_example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="email_id")
	String emailId;

	public User(int id, String lastName, String firstName, String emailId) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailId = emailId;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User(String lastName, String firstName, String emailId) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailId = emailId;
	}
	
	
	
	
	
}
