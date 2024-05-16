package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address_data")
public class Address {
	@Id
	private int address_id;
	private String street;
	private String city;
	private String state;
	private String zip_code;
	@OneToOne(mappedBy = "address")
	private Student student;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int address_id, String street, String city, String state, String zip_code, Student student) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.student = student;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zip_code=" + zip_code + ", student=" + student + "]";
	}

	
}
