package dev.designpattern.command;

public class Stock {
	private String id;
	private Integer quantity;
	
	public Stock(String id, Integer quantity) {
		this.id = id;
		this.quantity = quantity;
	}
	
	public void buyStock() {
		System.out.println(this.quantity +" shares of Stock "+this.id+ " are bought");
	}
	
	public void sellStock() {
		System.out.println(this.quantity +" shares of Stock "+this.id+ " are sold");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
