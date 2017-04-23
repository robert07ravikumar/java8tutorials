package com.java8.pojo;

import java.math.BigDecimal;

public class Fruit {
    private String name;
    private int qty;
    private BigDecimal price;
    
	public Fruit(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
    
}
