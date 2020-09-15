package no.hvl.dat152.models;

import java.util.ArrayList;

public class Cart {
	
	private ArrayList<Product> cartlist;
	
	public Cart() {
		this.setCartlist(new ArrayList<Product>());
	}

	public ArrayList<Product> getCartlist() {
		return cartlist;
	}

	public void setCartlist(ArrayList<Product> cartlist) {
		this.cartlist = cartlist;
	}

}
