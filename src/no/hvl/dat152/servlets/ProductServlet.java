package no.hvl.dat152.servlets;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import static no.hvl.dat152.hjelp.UriMapping.PRODUCT_URL;

@WebServlet("/" + PRODUCT_URL)
public class ProductServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String locale = (String) Config.get(request.getSession(), Config.FMT_LOCALE);
		System.out.println(locale);
		response.sendRedirect("products.jsp");
	}
}
