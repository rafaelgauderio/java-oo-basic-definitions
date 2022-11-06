package entitites;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	/*
	public Product () {
		
	}
	*/
	// obriga o usuário a dar um nome ao produto ao instanciar. Evitando assim cadastrar um produto sem nome de
	// acordo com a minha regra de negócio
	public Product (String name) {
		this.name = name;
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	/*
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	*/
	
	public double totalValue() {
		return this.price * this.quantity;
	}
	
	public void addProducts (int addQuantity) {
		this.quantity += addQuantity; 
	}
	
	public void removeProducts (int removeQuantity) {
		this.quantity -= removeQuantity; 
	}

	@Override
	public String toString() {
		return 
				"Products [name=" + name 
				+ ", price=" + String.format("%.2f", price) 
				+ ", quantity=" + quantity 
				+ ", quantity in stock: "
				+ String.format("%.2f",this.totalValue()) 
				+"]";
	}
	
	
}
