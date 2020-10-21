package com.revature.beans;

public class Purse {
	String name;
	String size;
	
	public Purse() {
		
	}
	
	public Purse(String name, String size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Purse [name=" + name + ", size=" + size + "]";
	}
	
	
}
