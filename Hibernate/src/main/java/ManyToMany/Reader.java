package ManyToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Reader {
	
	@Id
	@Column(name="reader_id")
	private int id;
	private String email;
	private String first_name;
	private String last_name;
	@ManyToMany(mappedBy = "reader")
	private Set<Subscription> subscription;
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reader(int id, String email, String first_name, String last_name, Set<Subscription> subscription) {
		super();
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.subscription = subscription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Set<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(Set<Subscription> subscription) {
		this.subscription = subscription;
	}
	@Override
	public String toString() {
		return "Reader [id=" + id + ", email=" + email + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", subscription=" + subscription + "]";
	}
	
	
}
