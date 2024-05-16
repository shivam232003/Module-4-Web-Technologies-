package ManyToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Subscription {
	
	@Id
	@Column(name="subscription_id")
	private int id;
	private String subscription_name;
	@ManyToMany
	@JoinColumn(name="subscription_data")
	private Set<Reader> reader;
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subscription(int id, String subscription_name, Set<Reader> reader) {
		super();
		this.id = id;
		this.subscription_name = subscription_name;
		this.reader = reader;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubscription_name() {
		return subscription_name;
	}
	public void setSubscription_name(String subscription_name) {
		this.subscription_name = subscription_name;
	}
	public Set<Reader> getReader() {
		return reader;
	}
	public void setReader(Set<Reader> reader) {
		this.reader = reader;
	}
	@Override
	public String toString() {
		return "Subscription [id=" + id + ", subscription_name=" + subscription_name + ", reader=" + reader + "]";
	}
	
	
	
}
