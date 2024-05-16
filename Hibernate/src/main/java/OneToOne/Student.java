package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
	@Id
	private int student_id;
	private String student_name;
	@OneToOne
	@JoinColumn(name="student_details")
	private Address address;

	public Student() {
		super();	
	}

	public Student(int student_id, String student_name, Address address) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.address = address;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", address=" + address + "]";
	}
}
