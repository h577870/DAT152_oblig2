package no.hvl.dat152.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
		
	private Map<Product,Integer> cart;
	private double total;
	
	public Cart() {
		cart = new HashMap<Product, Integer>();
		this.total = 0.0;
	}
	
	public Map<Product, Integer> getCart() {
		return cart;
	}
	
	public void Add(Product p) {
		if (cart.containsKey(p)) {
			Integer prev = cart.get(p);
			prev = prev.intValue() + 1;
			cart.put(p, prev++);
		} else {
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
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal() {
		
		double total = 0;
		
		for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
			
			total += entry.getKey().getPrice() * entry.getValue();
			entry.getKey().setTotal(entry.getValue() * entry.getKey().getPrice());
		}
		
		this.total = total;
	}
	

}
