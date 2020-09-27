package no.hvl.dat152.hjelp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MaxCharTagHandler extends SimpleTagSupport {
	
	private String tekst;
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspWriter out = getJspContext().getOut();
		out.println(tekst);
		
	}
	
	public void setTekst(String tekst) {
		
		if (tekst.length() <= 10) {
			this.tekst = tekst;
		} else {
			
			this.tekst = tekst.substring(0, 10) + "...";
			
		}	
	}
}
