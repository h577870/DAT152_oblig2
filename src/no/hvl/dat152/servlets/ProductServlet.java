package no.hvl.dat152.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import no.hvl.dat152.models.Product;

import static no.hvl.dat152.hjelp.UriMapping.PRODUCT_URL;

@WebServlet("/" + PRODUCT_URL)
public class ProductServlet extends HttpServlet {
	
	Product product;
	ArrayList<Product> productlist;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
		product = new Product();
		product.putProducts();
		productlist = product.getProductlist();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setAttribute("productlist", productlist);
		
		String locale = (String) Config.get(request.getSession(), Config.FMT_LOCALE);
		System.out.println(locale);
		request.getRequestDispatcher("/products.jsp").forward(request, response);
	}
}
