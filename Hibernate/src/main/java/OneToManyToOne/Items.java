package OneToManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_data")
public class Items {
	
	@Id
	private int item_id;
	private double item_total;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="cart_details")
	private Cart cart;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int item_id, double item_total, int quantity, Cart cart) {
		super();
		this.item_id = item_id;
		this.item_total = item_total;
		this.quantity = quantity;
		this.cart = cart;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public double getItem_total() {
		return item_total;
	}
	public void setItem_total(double item_total) {
		this.item_total = item_total;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Items [item_id=" + item_id + ", item_total=" + item_total + ", quantity=" + quantity + ", cart=" + cart
				+ "]";
	}
	
	
}
