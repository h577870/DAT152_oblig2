package no.hvl.dat152.servlets;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import no.hvl.dat152.hjelp.Location;

import java.io.IOException;

//Servlet for når me har lyst å bytte språk manuellt, bruker
//chooselanguage.jps som refererer til denne
@WebServlet("/SetLanguage")
public class SetLanguageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String locale = request.getParameter("locale");
        Location l = new Location();
        if(locale != null){
        	if(l.isValid(locale)) {
            Config.set(request.getSession(), Config.FMT_LOCALE, locale);
            Cookie lC = new Cookie("locale", locale);
            lC.setMaxAge(60 * 60 * 24 * 365);
            response.addCookie(lC);
        	}else {
        		 Config.set(request.getSession(), Config.FMT_LOCALE, "en_US");
                 Cookie lC = new Cookie("locale", "en_US");
                 lC.setMaxAge(60 * 60 * 24 * 365);
                 response.addCookie(lC);
        	}
        }
        String referrer = request.getHeader("referer");
        response.sendRedirect(referrer);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
