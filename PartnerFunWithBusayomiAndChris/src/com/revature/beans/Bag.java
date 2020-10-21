package com.revature.beans;

public class Bag {
	int amount;
	String color;
	Purse p;
	
	public Bag() {
		
	}
	
	public Bag(int amount, String color, Purse p) {
		super();
		this.amount = amount;
		this.color = color;
		this.p = p;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Purse getP() {
		return p;
	}

	public void setP(Purse p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Bag [amount=" + amount + ", color=" + color + ", p=" + p + "]";
	}
		
}
