package Entities;

public class Game {
	private String name;
	private float price;
	private int discount=0;
	
	public Game() {
		
	}
	
	public Game(String name, float price, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public Game(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price-(discount*price/100);
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
}
