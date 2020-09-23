package no.hvl.dat152.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
		
	private Map<Product,Integer> cart;
	
	public Cart() {
		cart = new HashMap<Product, Integer>();
	}
	
	public Map<Product, Integer> getCart() {
		return cart;
	}
	
	public void Add(Product p) {
		if (cart.containsKey(p)) {
			Integer prev = cart.get(p);
			prev = prev.intValue();
			System.out.println("Upping quantity of product " + p.getName() + " to " + prev);
			cart.put(p, prev++);
		} else {
			System.out.println("Added new product " + p.getName() + " to the cart");
			cart.put(p, 1);
		}
	}
	
	public int Quantity(Product p) {
		return cart.get(p);
	}
	
	public void Show() {
		
		cart.forEach((prod, quantity) -> {
			
			System.out.println("Name: " + prod.getName() + " | quantity: " + quantity + "\n");
			
		});
	}

}
