package no.hvl.dat152.servlets;

import java.io.IOException;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import no.hvl.dat152.models.Cart;

import static no.hvl.dat152.hjelp.UriMapping.HOME_URL;

@WebServlet("/" + HOME_URL)
public class HomeServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//noe greier her...
		//prøver på å få tak i cookies
		//Dersom ingen cookie funnet, lager en ny, sender tilbake til home
		
		
		HttpSession session = request.getSession(false);
		if (session == null) { //opprett Cart, legg i session
			
			Cart cart = new Cart();
			session = request.getSession(); //overkj�r forrige variabel, (getSession uten argument lager tydeligvis ny session...)
			session.setAttribute("cart", cart);

			
		}
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie cookie : cookies){
				if (cookie.getName().equals("locale")){
					Config.set(request.getSession(),Config.FMT_LOCALE, cookie.getValue());
				}
			}
		}else{
			Locale locale = request.getLocale();
			Config.set(request.getSession(), Config.FMT_LOCALE, locale.getLanguage());
			Cookie lC = new Cookie("locale", locale.getLanguage());
			lC.setMaxAge(60 * 60 * 24 * 365);
			response.addCookie(lC);
		}
		response.sendRedirect("home.jsp");
		
	}
	
}
