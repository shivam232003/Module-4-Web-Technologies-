package OneToManyToOne;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private int cart_id;
	private double total;
	private String name;
	@OneToMany(mappedBy = "cart")
	private Set<Items> items;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cart_id, double total, String name, Set<Items> items) {
		super();
		this.cart_id = cart_id;
		this.total = total;
		this.name = name;
		this.items = items;
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", total=" + total + ", name=" + name + ", items=" + items + "]";
	}
	
	
}
