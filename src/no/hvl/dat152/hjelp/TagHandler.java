package no.hvl.dat152.hjelp;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport{
	
	private String tekst="";
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.print("© " + tekst);
	}
	
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

}
