package no.hvl.dat152.models;

import java.util.ArrayList;

public class Product {
	
	private int id;
	private String name;
	private String description;
	//Euro som standard.
	private double price;
	private double total;
	private String imgref;
	
	private ArrayList<Product> productlist = new ArrayList<>();
	
	public Product() {}

	public Product(int id, String name, String description, double price, double total, String imgref) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgref = imgref;
		this.total = total;
		
	}
	
	public void putProducts() {
		productlist.add(new Product(0, "Kjeldsberg hele bønner", "Du må ha bønnekvern for å kjøpe denne...", 999.90, 0.0, "resources/kjeldsberg.png"));
		productlist.add(new Product(1, "Friele sjokoladekaffe", "Smaker snop", 45.69, 0.0, "resources/friele.png"));
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgref() {
		return imgref;
	}

	public void setImgref(String imgref) {
		this.imgref = imgref;
	}

	public ArrayList<Product> getProductlist() {
		return productlist;
	}

	public void setProductlist(ArrayList<Product> productlist) {
		this.productlist = productlist;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double getTotal() {
		return total;
	}
	
	@Override
	public boolean equals(Object product) {
		Product other = (Product) product;
		return this.id == other.id;
	}
	
}
