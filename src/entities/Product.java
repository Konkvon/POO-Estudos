package entities;

public class Product {
	public String name;
	public Double price;
	public int quantity;

	public Double TotalValueInStock() {
		return price * quantity;
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		    return String.format("%s, price: %.2f, %d units, Total: %.2f", name, price, quantity, TotalValueInStock());
		}

	}

