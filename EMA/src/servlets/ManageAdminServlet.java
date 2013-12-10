package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ManageAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String name;
	String username;
	String password;
	
	/***************************/
    //	METHODS
    /***************************/
	
	public void displayEventInfo() {
		
    }

    public void displayManageResult() {
    	
    }
	
    /***************************/
    
    public ManageAdminServlet() {
        super();
        
    }

	public void init(ServletConfig config) throws ServletException {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		name = request.getParameter(arg0);
		username = request.getParameter(arg0);
		password = request.getParameter(arg0);
	}
}
