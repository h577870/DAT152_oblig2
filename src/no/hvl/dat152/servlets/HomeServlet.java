package no.hvl.dat152.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static no.hvl.dat152.hjelp.UriMapping.HOME_URL;

@WebServlet("/" + HOME_URL)
public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void homeGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//noe greier her...
	}
	
}
