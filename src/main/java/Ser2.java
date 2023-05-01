

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
public class Ser2 extends GenericServlet {

	 String course;
	 String Trainer;
	 

	  public void init(ServletConfig sc) throws ServletException
	  {
		   // from sc getting context obj
		  
		ServletContext  ctxt=   sc.getServletContext();
		   
		  //  using ctxt reading  common info from web.xml
		
		 course= ctxt.getInitParameter("course");
		 Trainer= ctxt.getInitParameter("Trainer");
		  
			  
		
		  
	  }
	  
	   public void service( ServletRequest req, ServletResponse resp) throws ServletException,IOException
	   {
	   // cuurent 	Servlet is using
		   PrintWriter  out=  resp.getWriter();
		      
		      out.println("WELCOME TO VNCIT -2 OFFICE</br>");
		      out.println("==========================</br>");
		      out.println("</br> here common info is :");
		      out.println("</br> course name is   :"+course);
		      out.println("</br> Trainer name is  :"+Trainer);
		      out.println("</br>==========================");
	   }
	   
	    public void destroy()
	    {
	    	
	    }
}
